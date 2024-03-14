package day59_JavaReview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;

public class C02_MapMethods {
    public static void main(String[] args) {
        /*
        Methods of Map:
		put(key, value): inserts the given key and value to map
		get(key): returns the value of the given key
		replace(key, newValue): replaces the value of the given key with the given new value
		remove(key): removes the given key and its value from the map
		containsKey(key): returns true if the given key is contained in the map, otherwise returns false
		containsValue(Value): returns true if the given value is contained in the map, otherwise returns false
		isEmpty(): returns true if the size of the map is 0, otherwise returns false
		equals(Map): returns true if the given Map is equal with the current map, otherwise returns false
		clear(): removes all the pairs from the map
		---------------------------

		keySet(): returns all the keys of the map, returnType is Set
		values(): returns all the values of the map, returnType is Collection
		entrySet(): returns all the entries (Entry: key & value) of map

				getkey()
				getValue()
				setValue()

         */

        Map<String, Integer> students=new LinkedHashMap<>();
        students.put("Ali", 75);
        students.put("Aliye", 80);
        students.put("Nisa", 90);
        students.put("Tugba", 90);
        students.put("Hatice", 94);
        students.put("Hatice", 65);

        System.out.println(students);

        System.out.println(students.get("Nisa"));

        System.out.println(students.size());

        System.out.println("--------------");

        System.out.println(students.get("Hatice"));

        students.replace("Hatice",93);
        System.out.println(students.get("Hatice"));

        students.remove("Aliye");
        System.out.println(students);

        System.out.println(students.size());

        System.out.println("*-------------------");

        System.out.println(students.containsKey("Aliye"));
        System.out.println(students.containsValue(93));
        System.out.println(students.containsValue("93"));

        Map<String, Integer> successfulStud=new LinkedHashMap<>();

        successfulStud.putAll(students);
        System.out.println(successfulStud);


        Map<String, Integer> successfulStud2=new LinkedHashMap<>(students);

        System.out.println(successfulStud2);

        students.clear();
        System.out.println(students);
        System.out.println(students.isEmpty());
        System.out.println("successfulStud2.isEmpty() = " + successfulStud2.isEmpty());


    }
}
