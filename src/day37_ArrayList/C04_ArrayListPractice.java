package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C04_ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<String> meyveler1 = new ArrayList<>();
        meyveler1.add("elma");
        meyveler1.add("armut");
        meyveler1.add("kayısı");
        meyveler1.add("üzüm");
        meyveler1.add("erik");

        ArrayList<String> meyveler2 = new ArrayList<>(Arrays.asList("armut", "kayısı", "üzüm"));
        System.out.println("meyveler1 = " + meyveler1);
        meyveler1.removeAll(meyveler2);
        System.out.println("meyveler1 = " + meyveler1);

        //removeIf()
        ArrayList <String> nameList = new ArrayList<>();
        nameList.add("Ali");
        nameList.add("Veli");
        nameList.add("Filiz");
        nameList.add("Macit");
        nameList.add("Selma");
        nameList.add("Hadi");

        System.out.println("nameList = " + nameList);

        nameList.removeIf(e->e.charAt(e.length()-1)=='i');

        System.out.println("nameList = " + nameList);

    }

    /*
    Birinci arrayList e elma, armut, kayısı, üzüm, erik;
    İkinci arrayListe e armut, kayısı, üzüm değerlerini atayalım ve
    İlk arrayList in içinden ikinci arrayList i çıkartalım.

     */
}
