package day56_LoopsAndMap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C03_Iterator {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(25);
        set.add(35);
        set.add(6);
        set.add(16);
        set.add(17);
        set.add(18);
        set.add(19);

        // 25 den küçük olanları çıkar

        System.out.println("set = " + set);

        Iterator<Integer> iterator = set.iterator();

     /*   System.out.println("iterator.hasNext() = " + iterator.hasNext());
        System.out.println("iterator.next() = " + iterator.next());
        System.out.println("iterator.hasNext() = " + iterator.hasNext());
        System.out.println("iterator.next() = " + iterator.next());
        System.out.println("iterator.hasNext() = " + iterator.hasNext());
        System.out.println("iterator.next() = " + iterator.next());
        System.out.println("iterator.hasNext() = " + iterator.hasNext());
        System.out.println("iterator.next() = " + iterator.next());
        System.out.println("iterator.hasNext() = " + iterator.hasNext());
        System.out.println("iterator.next() = " + iterator.next());
        System.out.println("iterator.hasNext() = " + iterator.hasNext());
        System.out.println("iterator.next() = " + iterator.next());
        System.out.println("iterator.hasNext() = " + iterator.hasNext());
        System.out.println("iterator.next() = " + iterator.next());
        System.out.println("iterator.hasNext() = " + iterator.hasNext());
   */
        while (iterator.hasNext()){
           Integer sayi = iterator.next();
           if (sayi<25){
               iterator.remove();
           }
        }

        System.out.println("set = " + set);

    }
}
