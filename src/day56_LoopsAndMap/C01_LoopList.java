package day56_LoopsAndMap;

import java.util.*;

public class C01_LoopList {
    public static void main(String[] args) {
         /*
    1- For, While, Do-While
    2- For Each loop
    3- Iterator (Java 8 ile gelmiştir.  Lambda expression)
    4- forEach() method
     */

        String [] names = {"Ali","Esin","Esin","Jale","Melih"};

        for (String name : names){
            System.out.print(name+" ");
        }
        System.out.println();

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]+" ");
        }
        System.out.println();
        System.out.println("--------------------");

        //az sonra yazılacak...
        long count = Arrays.stream(names).distinct().count();
        System.out.println("count = " + count);
       // Arrays.  bana arraylerle ilgili bazı kolaylıklar sağlar.
        boolean b = Arrays.stream(names).anyMatch(element -> element.equals("Hale"));
        System.out.println("b = " + b);


        List<Integer> numbers = new ArrayList<>();
        numbers.add(25);
        numbers.add(35);
        numbers.add(6);
        numbers.add(16);



        //25'den küçük rakamları listeden sil ve listi ekrana yazdır.

        System.out.println(numbers);

        for (Integer number : numbers){
            if(number<25){
                numbers.remove(number);

            }
        }
        System.out.println(numbers);

        System.out.println("--------------------");

        List<Integer> nums = new ArrayList<>();
        nums.add(25);
        nums.add(35);
        nums.add(6);
        nums.add(16);
        nums.add(37);
        nums.add(18);
        nums.add(19);

        System.out.println("nums = " + nums);

        //25'den küçük rakamları listeden sil ve listi ekrana yazdır.

        for (int i = 0; i < nums.size();i++ ) {
            if (nums.get(i)<25){
                nums.remove(nums.get(i));
                i--;
            }

        }

        System.out.println("nums = " + nums);


        Set<Integer> set = new HashSet<>();
        set.add(25);
        set.add(35);
        set.add(6);
        set.add(16);
        set.add(37);
        set.add(18);
        set.add(19);

        // 25 den küçük olanları çıkar

        List<Integer> list =new ArrayList<>(set);
        System.out.println("list = " + list);
     //   list.addAll(set);  böyle de eklenebilir...

    }
}
