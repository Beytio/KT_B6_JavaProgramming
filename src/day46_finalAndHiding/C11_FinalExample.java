package day46_finalAndHiding;

import javax.print.attribute.standard.MediaSize;
import java.util.ArrayList;
import java.util.Arrays;

public class C11_FinalExample {
    public static void main(String[] args) {
        final String NAME = "Mustafa";
      //  NAME = "Ziya";  hata verir. çünkü final değişkenin değeri değişmez.

        final String [] NAMES = {"Havva","Cemile","Nazmi","Efsun"};

        System.out.println(Arrays.toString(NAMES));
        System.out.println(NAMES);

        NAMES[1] = "Melike";  // arrayin içindeki değer değişir ama referans değeri değişemez.

        System.out.println(Arrays.toString(NAMES));

        final int AGE = 30;
       // AGE = 32;  ata verir. çünkü final değişkenin değeri değişmez.

        //ArrayListlerde de arrayler gibidir..

         final ArrayList <Integer> list = new ArrayList(Arrays.asList(1,2,3,4,5,6));

        System.out.println("list = " + list);

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i)*2);
        }

        System.out.println("list = " + list);
        int index =0;
        for (Integer each : list){
            list.set(index,each*2);
            index++;
        }
        System.out.println("list = " + list);

        list.replaceAll(elem -> elem*2);

        System.out.println("list = " + list);

        list.removeIf(element -> element % 3 ==0);

        System.out.println("list = " + list);

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(3,6,10,20));

       // list = list1; hata verir.. çünkü referansı değiştirmeye çalıştık..
    }
}
