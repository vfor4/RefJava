package CompletableInFuture.BestPriceFinder;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

public class BestFinder {
    private final List<Shop> shops = Arrays.asList(new Shop("BestPrice"),
            new Shop("LetsSaveBig"),
            new Shop("MyFavoriteShop"),
            new Shop("ShopEasy"),
            new Shop("BuyItAll"));

    private final Executor executor = Executors.newFixedThreadPool(Math.min(shops.size(), 100),
            r -> {
                Thread t = new Thread(r);
                t.setDaemon(true);
                return t;
            }
    );


    public List<String> findPrices(String product) {
        // if we run it with stream() it takes 4 seconds.
        // if we run it with parallelStream() it takes 1 second. Because my machine is 4 cores
        return shops.stream().map(s -> s.getPrice("S27"))
                .map(Quote::parse)
                .map(Discount::applyDiscount)
                .toList();
    }

    public List<String> findPricesAsync(String product) {
        List<CompletableFuture<String>> result =
//        List<String> result =
                shops.stream()
                        .map(s -> CompletableFuture.supplyAsync(() ->
                        {
                            System.out.println(s.getName());
                            return String.format("%s price %s", s.getName(), s.getPrice(product));
                        }, executor))
                        .toList();
//        return result;
        return result.stream().map(
                (x) -> {
                    String text = x.join();
                    System.out.println(text);
                    return text;
                }
        ).toList();
    }

    public List<String> findPriceWithApplyDiscountAsync(String product) {
        List<CompletableFuture<String>> result = shops.stream().map(s -> CompletableFuture.supplyAsync(() -> s.getPrice("S27"), executor))
                .map(future -> future.thenApply(Quote::parse))
                .map(future -> future.thenCompose(
                        quote -> CompletableFuture.supplyAsync(() -> Discount.applyDiscount(quote), executor)
                ))
                .toList();
        return result.stream().map(CompletableFuture::join).toList();
    }

    public Stream<CompletableFuture<String>> findPriceWithReactiveAsync(String product) {
        return shops.stream().map(s -> CompletableFuture.supplyAsync(() -> s.getPrice("S27"), executor))
                .map(future -> future.thenApply(Quote::parse))
                .map(future -> future.thenCompose(
                        quote -> CompletableFuture.supplyAsync(() -> Discount.applyDiscount(quote), executor)
                ));
    }
}
