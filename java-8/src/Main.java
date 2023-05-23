import CompletableInFuture.BestPriceFinder.Quote;

import java.lang.reflect.Method;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.math.BigDecimal;
public class Main {
    public static void main(String[] args) {


       try {
          int b = 5 /0;
       }catch (Exception e){
           System.out.println(e.getLocalizedMessage());
       }

//        String s1 = "abcTDVa";
//        String s2 = "aaabbbcccaPH";
//        String s3 = "ghw";
//        // trung nhau
//        long start = System.nanoTime();
//        Map<String, Long> result =Arrays.stream(s3.split(""))
//                .filter(s2::contains)
//                .collect(Collectors.groupingBy(g->g, Collectors.counting()));
//
//        if(result.isEmpty()){
//            System.out.println("No");
//        }else{
//            System.out.println(result);
//        }
//        long end = System.nanoTime();
//        long time = (end - start) / 1_000_000;
//        System.out.println(time + "ms");
//
//        Map<Character, Integer> characterCount = new HashMap<>();
//
//        for (char c : s1.toCharArray()) {
//            characterCount.put(c, 0);
//        }
//
//        for (char c : s2.toCharArray()) {
//            if (characterCount.containsKey(c)) {
//                characterCount.put(c, characterCount.get(c) + 1);
//            }
//        }
//        characterCount.values().removeIf(v -> v == 0);
//
//        System.out.println(characterCount);
//        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));

//        Scanner in = new Scanner(System.in);
//        Deque<Integer> deque = new ArrayDeque<>();
//        int n = in.nextInt();
//        int m = in.nextInt();
//        long max = 0;
//        HashSet<Integer> hashset = new HashSet<>(m);
//        hashset.
//
//        for (int i = 0; i < n; i++) {
//            int num = in.nextInt();
//            deque.add(num);
//            if( i >= m-1){
//                max = Math.max(max, new HashSet<>(deque).size());
//                deque.remove();
//            }
//            if( max == m) {
//                break;
//            }
//        }
//        System.out.println(max);
//
//
//        Scanner sc = new Scanner(System.in);
//        int setSize = sc.nextInt();
//        int noOps = sc.nextInt();
//        BitSet[] b1 = new BitSet[]{new BitSet(setSize), new BitSet(setSize)};
//        Map<String, BiConsumer<Integer, Integer>> map = new HashMap<>();
//        map.put("AND", (index1, index2)-> b1[index1-1].and(b1[index2-1]));
//        map.put("OR",(index1, index2)-> b1[index1-1].or(b1[index2-1]));
//        map.put("XOR",(index1, index2)-> b1[index1-1].xor(b1[index2-1]));
//        map.put("FLIP",(index1, index2)-> b1[index1-1].flip(index2));
//        map.put("SET",(index1, index2)-> b1[index1-1].set(index2));
//        for (int i = 0; i < noOps; i++){
//            map.get(sc.next()).accept(sc.nextInt(), sc.nextInt());
//            System.out.println(b1[0].cardinality() + " " + b1[1].cardinality());
//        }
    }
}