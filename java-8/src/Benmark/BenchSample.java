package Benmark;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class BenchSample {

    public static void reverseString(char[] s) {
        char[] r = new char[s.length];
        for (int i = s.length - 1, j = 0; i >= 0; i--, j++) {
            r[j] = s[i];
        }
        s = r;
    }

    public static void refByValue(int a){
        a = 10;
    }

    public static void main(String[] args) {
        char[] i = new char[]{'h', 'e', 'l', 'l', 'o'};
       reverseString(i);
        System.out.println(i);

        int b = 5;
        refByValue(b);
        System.out.println(b);
    }
}