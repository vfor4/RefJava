package CompletableInFuture.BestPriceFinder;

import java.util.concurrent.CompletableFuture;

public class MainReactive {
    public static void main(String[] args) {
        BestFinder bestFinder = new BestFinder();
        long start = System.nanoTime();

        CompletableFuture[] futures = bestFinder.findPriceWithReactiveAsync("myPhone27S")
                .map(f -> f.thenAccept(s -> System.out.println(s + " (done in " + ((System.nanoTime() - start) / 1_000_000) + " msecs)")))
                .toArray(CompletableFuture[]::new);

        CompletableFuture.anyOf(futures).join();

        System.out.println("All shops have now responded in " + ((System.nanoTime() - start) / 1_000_000) + " msecs");
    }
}
