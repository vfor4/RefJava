package CompletableInFuture;

import java.util.concurrent.*;

public class CompletableFutureEx {
    public static void main(String[] args) throws InterruptedException {
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        Future<String> future = executorService.submit(new Callable<String>() {
//            @Override
//            public String call() throws Exception {
//                System.out.println("inside call method");
//                // do something
//                return "me second";
//            }
//        });
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(
                ()-> {
                    System.out.println("inside applyAsync");
                    return "me second";
                }
        );

        doSomethingElse();
        try {
            String result = future1.get(3, TimeUnit.SECONDS);
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            System.out.println(e.getMessage());
        } catch (TimeoutException e) {
            System.out.println("time out");
        }

    }

    private static void doSomethingElse() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("me first");
    }
}
