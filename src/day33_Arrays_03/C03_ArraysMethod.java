package day33_Arrays_03;

import java.util.Arrays;
import java.util.Random;

public class C03_ArraysMethod {
    public static void main(String[] args) {

        // split
        String str="Merhaba Güzel Insan";
        String [] strArray=str.split(" ");
        System.out.println("Arrays.toString(strArray) = " + Arrays.toString(strArray));

    //    String[] strArr1=strArray[0].split("");
   //     System.out.println("Arrays.toString(strArr1) = " + Arrays.toString(strArr1));
        System.out.println("----------------------------------");





        //sort  -- methodu arraylerin içerinideki verileri sıralar
        Arrays.sort(strArray);
        System.out.println("Arrays.toString(strArray) = " + Arrays.toString(strArray));
        System.out.println("-----------------------");





        //toCharArray()-- char array e cevirdim
        char[] charArray=strArray[0].toCharArray();
        System.out.println("Arrays.toString(charArray) = " + Arrays.toString(charArray));
        System.out.println(charArray);


        System.out.println("---------------------");

        //copyOfRange()
        String [] students={"Rabia","Nisa","Ayşe", "Yusuf","Hacer", "Tugba",   "Mehmet"};

        String [] newList=Arrays.copyOfRange(students, 1, 6);

        System.out.println("Arrays.toString(newList) = " + Arrays.toString(newList));


        //sort()

        Random random=new Random();
        int[] numbers=new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=random.nextInt(50);
        }

        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));


        System.out.println("-------------------");

        // fill()
        int numbers2[]=new int[5];
        numbers2[0]=3;
        System.out.println("Arrays.toString(numbers2) = " + Arrays.toString(numbers2));

        Arrays.fill(numbers2,2,4,333);

        System.out.println("Arrays.toString(numbers2) = " + Arrays.toString(numbers2));

    }
}
