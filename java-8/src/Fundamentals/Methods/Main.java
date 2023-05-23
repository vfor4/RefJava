package Fundamentals.Methods;

import Fundamentals.BridgeMethod.MyNode;
import Fundamentals.BridgeMethod.Node;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Pair<Integer, String> pair1 = new Pair<>(1, "banana");
//        Pair<Integer, String> pair2 = new Pair<>(1, "apple");
//        Pair<Integer, String> pair3 = new Pair<>(2, "banana");
//        System.out.println(Utils.compareObj(pair1, pair2));
//
//        Box<Integer> box1 = new Box<>();
//        Box<Integer> box2 = new Box<>();
//        box1.add(1.0);
//
//        box1.boxTest(box2);
//
//
//        Serializable s = pick("d", new ArrayList<String>());
//        List<Box<Integer>> listOfIntegerBoxes =
//                new java.util.ArrayList<>();
//        BoxDemo.addBox(10, listOfIntegerBoxes);
//        BoxDemo.addBox(20, listOfIntegerBoxes);
//        BoxDemo.addBox(30, listOfIntegerBoxes);
//        BoxDemo.outOfBoxes(listOfIntegerBoxes);
//        BoxDemo a = new BoxDemo();
//        a.processStringList(Collections.emptyList());
//        a.processStringWithWildcard(new ArrayList<Double>());
//        BoxDemo.printElement(Arrays.asList(1, 2, 3));
//        BoxDemo.printElement(Arrays.asList("one", "two", "three"));
//        BoxDemo.printElement(null);


        MyNode mn = new MyNode(5);
        Node n = mn;            // A raw type - compiler throws an unchecked warning
        n.setData("Hello");     // Causes a ClassCastException to be thrown.
        Integer x = mn.data;
    }
    static <T> T pick(T a1, T a2) { return a2; }
}
