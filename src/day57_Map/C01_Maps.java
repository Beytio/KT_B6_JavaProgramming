package day57_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class C01_Maps {
    public static void main(String[] args) {
        // hashMap , LinkedHashMap , TreeMap
        // hızlı işlem yapabilmek için kendi algoritmasına göre verileri sıralar

        Map<Integer, String> hmap=new HashMap<>();
        hmap.put(2,"Ayşe");
        hmap.put(5,"Fatma");
        hmap.put(25,"Osman");
        hmap.put(12,"Yahya");
        hmap.put(32,"Samet");

        System.out.println("hmap = " + hmap);

        // ekleme sırasına göre verileri depolar
        Map<Integer, String> lHmap=new LinkedHashMap<>();
        lHmap.put(2,"Ayşe");
        lHmap.put(5,"Fatma");
        lHmap.put(25,"Osman");
        lHmap.put(12,"Yahya");
        lHmap.put(32,"Samet");

        System.out.println("lHmap = " + lHmap);


        // her zaman Key değerlerine göre sıralar
        Map<Integer, String> tMap=new TreeMap<>();
        tMap.put(2,"Ayşe");
        tMap.put(5,"Fatma");
        tMap.put(25,"Osman");
        tMap.put(12,"Yahya");
        tMap.put(32,"Samet");

        System.out.println("tMap = " + tMap);

    }
}
