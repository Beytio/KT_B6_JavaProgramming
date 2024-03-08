package day53_Collections2;

import java.util.*;

public class C05_SetPractice3 {
    public static void main(String[] args) {
        String []arr={"Book","Notebook","Food","PencilCase","Book","Book","Pen", "Spoon","Mirror", "Spoon", "WaterBottle"
        ,"Phone","Phone"};

        System.out.println("arr.length = " + arr.length);


        Set<String > uniqueItemInTheBag=new HashSet<>(Arrays.asList(arr));
        System.out.println("uniqueItemInTheBag = " + uniqueItemInTheBag);
        System.out.println("uniqueItemInTheBag.size() = " + uniqueItemInTheBag.size());


        System.out.println("-------------------");
        Set<String> uniqueItemInTheBag2=new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println("uniqueItemInTheBag2 = " + uniqueItemInTheBag2);
        System.out.println("uniqueItemInTheBag2.size() = " + uniqueItemInTheBag2.size());


        System.out.println("-------------------------");

        Set<String > uniqueItemInTHeBag3=new TreeSet<>(Arrays.asList(arr));
        System.out.println("uniqueItemInTHeBag3 = " + uniqueItemInTHeBag3);
        System.out.println("uniqueItemInTHeBag3.size() = " + uniqueItemInTHeBag3.size());
    }
}
