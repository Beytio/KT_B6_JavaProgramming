package day57_Map;

import day21_ClassAndMethods.Main;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class C02_MapMethos {
    public static void main(String[] args) {
        //put() ,get(),values(),keyset(),clear(),containsKey(),remove(),entrySet(),equals(),forEach(),isEmpty()
        //putAll(),replace()

        Map<Integer, String> map=new TreeMap<>();
        map.put(12, "Nisa Kılıç");
        map.put(13, "Tuğba Aydın");

        System.out.println(map.get(13));

        System.out.println("--------------------");

        System.out.println(map.values());

        System.out.println("-------------");

        Set<Integer> set = map.keySet();
        set.forEach(x-> System.out.println(x));


        map.put(12,"Hatice Hanım");
        System.out.println(map.get(12));
        map.put(14,"Tuğba Aydın");

        System.out.println(map);

       // map.clear();
        System.out.println(map.containsKey(12));
        System.out.println(map.containsValue("Nisa Kılıç"));


        System.out.println(map);

        map.remove(14);
        System.out.println(map);
        System.out.println(map.remove(13, "Nisa Kılıç"));


        System.out.println("-------------------");

        System.out.println(map.isEmpty());


        map.forEach((a,b)-> System.out.println("key :"+a+" value : "+b));

        System.out.println("----------------");

        map.replace(12, "Nisa Kılıç");
        System.out.println(map);

        System.out.println(map.replace(13, "Tuğba Aydın", "Hatice Hanım"));

        System.out.println(map.get(13));




    }
}
