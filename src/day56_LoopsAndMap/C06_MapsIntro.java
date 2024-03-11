package day56_LoopsAndMap;

import java.util.*;

public class C06_MapsIntro {
    public static void main(String[] args) {
        List<String > names = new ArrayList<>(Arrays.asList("Mehmet","Sema","Asuman","Bülent","Füsun"));
        List<Integer > numbers = new ArrayList<>(Arrays.asList(22,2,18,104,63));

        System.out.println("names = " + names);
        System.out.println("numbers = " + numbers);

        Map<String , Integer> studentNumbers = new TreeMap<>();

        studentNumbers.put("Mehmet",22);
        studentNumbers.put("Sema",2);
        studentNumbers.put("Asuman",18);
        studentNumbers.put("Bülent",104);
        studentNumbers.put("Füsun",62);
        studentNumbers.put("Füsun",88);

        System.out.println("studentNumbers = " + studentNumbers);

        System.out.println("studentNumbers.get(\"Asuman\") = " + studentNumbers.get("Asuman"));
        System.out.println("studentNumbers.get(\"Füsun\") = " + studentNumbers.get("Füsun"));

        Map<Integer , String> studentNames = new TreeMap<>();

        studentNames.put(22, null);
        studentNames.put(2, "Sema");
        studentNames.put(18, "Asuman");
        studentNames.put(104, "Bülent");
        studentNames.put(62, "Füsun");
        studentNames.put(62, "Sema");
        studentNames.put(55, null);
     //   studentNames.put(null, "Hakan");
       // studentNames.put(null, "Edip");

        System.out.println("studentNames = " + studentNames);




        System.out.println("studentNames.get(62) = " + studentNames.get(62));

        //System.out.println("studentNames.get(null) = " + studentNames.get(null));

        //valueları almak için

        System.out.println("studentNames.values() = " + studentNames.values());

        Set<Integer> keySet = studentNames.keySet();
        System.out.println("keySet = " + keySet);

        for (Integer key : keySet){
            System.out.println(key + " : "+ studentNames.get(key));
        }

        System.out.println("studentNames.containsKey(104) = " + studentNames.containsKey(104));
        System.out.println("studentNames.containsValue(\"Sema\") = " + studentNames.containsValue("Sema"));

        studentNames.clear();

        System.out.println("studentNames.containsKey(104) = " + studentNames.containsKey(104));
        System.out.println("studentNames.containsValue(\"Sema\") = " + studentNames.containsValue("Sema"));

        System.out.println("studentNames = " + studentNames);

    }
}
