package day52_collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class C03_LinkedList {
    public static void main(String[] args) {

        List<String> letters = new LinkedList<>();
        letters.add("K");
        letters.add("R");
        letters.add("A");
        letters.add("F");
        letters.add("T");
        letters.add("T");
        letters.add("E");
        letters.add("C");
        letters.add("H");

        System.out.println(letters);
        System.out.println("letters.indexOf(\"R\") = " + letters.indexOf("R"));
        System.out.println("letters.indexOf(\"T\") = " + letters.indexOf("T"));
        System.out.println("letters.lastIndexOf(\"T\") = " + letters.lastIndexOf("T"));

        letters.add("N");
        letters.add("I");
        letters.add("C");

        System.out.println(letters);
        letters.set(letters.size()-1,"K");
        System.out.println(letters);

        LinkedList<String > target = new LinkedList<>();
        target.addAll(Arrays.asList("R","T","G"));

        System.out.println("target = " + target);

        System.out.println("letters.containsAll(target) = " + letters.containsAll(target));

        target.set(2,"C");

        System.out.println("letters.containsAll(target) = " + letters.containsAll(target));

        System.out.println("letters.contains(target.get(1)) = " + letters.contains(target.get(1)));

        System.out.println("letters.contains(\"X\") = " + letters.contains("X"));
    }
}
