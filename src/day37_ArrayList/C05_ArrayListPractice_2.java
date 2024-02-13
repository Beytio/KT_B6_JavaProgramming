package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C05_ArrayListPractice_2 {
    public static void main(String[] args) {
        ArrayList<Integer> listOfNums = new ArrayList<>(Arrays.asList(5,10,15,15,20,25,25,100,100,500));
        System.out.println("listOfNums = " + listOfNums);

        printListNumbers(listOfNums);

        System.out.println("sum(listOfNums) = " + sum(listOfNums));
        System.out.println("sum_1(listOfNums) = " + sum_1(listOfNums));
        System.out.println("duplicate(listOfNums) = " + duplicate(listOfNums));
    }
    /*
    5,10,15,15,20,25,25,100,100,500 rakamlarını listOfNums isili
    bir ArrayListe atın ve
    printListNumbers(listOfNums); methodu ile yazdıralım.
     */

    public static void printListNumbers(ArrayList <Integer> listOfNums){
        for (int i = 0; i < listOfNums.size(); i++) {
            System.out.print(listOfNums.get(i)+" ");
        }
        System.out.println();
    }

    //sum(listOfNums); methodu ile de toplam değeri döndürelim.

    public static int sum(ArrayList <Integer> arrayList){
        int result = 0;
        for (Integer i : arrayList){
            result +=i;
        }

        return result;
    }

    public static int sum_1(ArrayList <Integer> arrayList){
        int result = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            result += arrayList.get(i);
        }

        return result;
    }

    //duplicate(listOfNums); methodu ile de değerleri dublicate
    //edip list i döndürelim.

    public static ArrayList<Integer> duplicate(ArrayList<Integer> arrayList){
        ArrayList<Integer> duplicateList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            duplicateList.add(arrayList.get(i));
            duplicateList.add(arrayList.get(i));
        }

        return duplicateList;
    }
}
