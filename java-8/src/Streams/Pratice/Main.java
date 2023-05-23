package Streams.Pratice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300), new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400), new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));

//      1. Find all transactions in the year 2011 and sort them by value (small to high).
        List<Transaction> a1 =
                transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .toList();
        System.out.println(a1);
//      2 . What are all the unique cities where the traders work?

        List<String> a2 =
                transactions.stream()
                        .map(t -> t.getTrader().getCity())
                        .distinct()
                        .toList();
        System.out.println(a2);

//      3 . Find all traders from Cambridge and sort them by name.

        List<Trader> a3 =
                transactions.stream()
                        .map(Transaction::getTrader)
                        .filter(t-> t.getCity().equals("Cambridge"))
                        .distinct()
                        .sorted(Comparator.comparing(Trader::getName))
                        .toList();
        System.out.println(a3);
//      4 . Return a string of all traders’ names sorted alphabetically.
       String a4 =
                transactions.stream()
                        .map(t->t.getTrader().getName())
                        .distinct()
                        .sorted()
                        .reduce("", (n,m)-> n+" "+m);
        System.out.println(a4.trim());

//      5 . Are any traders based in Milan?
        boolean a5= transactions.stream().anyMatch(t->t.getTrader().getCity().equals("Milan"));
        System.out.println(a5);
//      6 . Print all transactions’ values from the traders living in Cambridge.
        transactions.stream().filter(t -> "Cambridge".equals(t.getTrader().getCity()))
                .map(Transaction::getValue)
                .forEach(System.out::println);
//      7 . What’s the highest value of all the transactions?
        int a6 = transactions.stream().max(Comparator.comparing(Transaction::getValue)).get().getValue();
        System.out.println(a6);
//      8 . Find the transaction with the smallest value.
        Transaction a7 = transactions.stream().min(Comparator.comparing(Transaction::getValue)).get();
        System.out.println(a7);
    }
}
