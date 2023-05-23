package CompletableInFuture.BestPriceFinder;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

public class Shop {
    private final String name;
    private final Random random;

    public Shop(String name) {
        this.name = name;
        random = new Random(name.charAt(0) * name.charAt(1) * name.charAt(2));
    }

    public static void delay() {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String getPrice(String product) {
        double price = calculatePrice(product);
        Discount.Code code = Discount.Code.values()[random.nextInt(Discount.Code.values().length)];
        return name + ":" + price + ":" + code;
    }

    public double calculatePrice(String product) {
        delay();
        return Math.random() * product.charAt(0) + product.charAt(1);
    }

    public Future<Double> getPriceAsync(String product) {
        CompletableFuture<Double> future = new CompletableFuture<>();
        new Thread(() -> {
            try{
                double price = calculatePrice(product);
                future.complete(price);
            } catch (Exception e){
                future.completeExceptionally(e);
            }
            System.out.println("im still running because im delegated to future to handle exception");
        }).start();
        return future; // return future without waiting for the computation to be completed
    }

    public String getName() {
        return name;
    }

    public Random getRandom() {
        return random;
    }

    public Future<Double> getPriceAsyncV2(String product) {
        return CompletableFuture.supplyAsync(() -> calculatePrice(product));
    }
}
