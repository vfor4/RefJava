package CompletableInFuture.BestPriceFinder;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Shop shop = new Shop("name");
//        Future<Double> future = shop.getPriceAsync("hi");
//        System.out.println("me first");
//        System.out.println(future.get());
        // Making non-blocking code
        BestFinder bestFinder = new BestFinder();
        long start = System.nanoTime();
        // 1. find by sequence
//        System.out.println(bestFinder.findPrices("any"));

        // 2. using CompletableFutureEx
//        System.out.println(bestFinder.findPricesAsync("any"));
//        System.out.println(bestFinder.findPriceWithApplyDiscountAsync("any"));

//        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(Thread.activeCount());
        long end = (System.nanoTime() - start)/ 1_000_000;
        // run with stream() (7s). run with parallelStream() (2s).
        System.out.println("returned after " + end + "ms");
    }
}
