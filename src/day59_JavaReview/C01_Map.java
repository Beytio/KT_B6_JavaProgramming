package day59_JavaReview;

import java.util.*;

public class C01_Map {
    public static void main(String[] args) {
            /*
    Map (I): part of collections framework
		 does not support primitives
		 size is dynamic
		 key MUST be unique, value can be duplicated

		HashMap (C): both key and value can be null
					    the random order

		LinkedHashMap (C): both key and value can be null
						the insertion order

		TreeMap (C): key can not be null, but value can be null
					    the sorted order

		Hashtable (C): both key and value can NOT be null
					Maintains the random order
					synchronized-->Thread safe
     */

        Map<Integer,String> hashMap=new HashMap<>();

        hashMap.put(10,"Ali");
        hashMap.put(20,"Aliye");
        hashMap.put(30,"Atakan");
        hashMap.put(40,"Nisa");
        hashMap.put(50,"Tugba");
        hashMap.put(50,"Samet");
        hashMap.put(null,"Samet");
        hashMap.put(null,"Ahmet");
        hashMap.put(60,null);

        System.out.println(hashMap);


        System.out.println("-----------------------------------");

        Map<Integer,String> linkedHashMap=new LinkedHashMap<>();

        linkedHashMap.put(10,"Ali");
        linkedHashMap.put(20,"Aliye");
        linkedHashMap.put(30,"Atakan");
        linkedHashMap.put(40,"Nisa");
        linkedHashMap.put(50,"Tugba");
        linkedHashMap.put(50,"Samet");
        linkedHashMap.put(null,"Samet");
        linkedHashMap.put(null,"Ahmet");
        linkedHashMap.put(60,null);

        System.out.println(linkedHashMap);


        System.out.println("-----------------------");


        Map<Integer,String> treeMap=new TreeMap<>();

        treeMap.put(110,"Ali");
        treeMap.put(120,"Aliye");
        treeMap.put(330,"Atakan");
        treeMap.put(40,"Nisa");
        treeMap.put(50,"Tugba");
        treeMap.put(50,"Samet");
      //  treeMap.put(null,"Samet");   key null olamaz
      //  treeMap.put(null,"Ahmet");
        treeMap.put(60,null);

        System.out.println(treeMap);


        System.out.println("-------------------");



        Map<Integer,String> hashTable=new Hashtable<>();

        hashTable.put(110,"Ali");
        hashTable.put(120,"Aliye");
        hashTable.put(330,"Atakan");
        hashTable.put(40,"Nisa");
        hashTable.put(50,"Tugba");
        hashTable.put(50,"Samet");
        //  hashTable.put(null,"Samet");  key null olamaz
        //  hashTable.put(null,"Ahmet");
        //  hashTable.put(60,null);       value null olamaz

        System.out.println(hashTable);

    }
}
