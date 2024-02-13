package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C06_ArrayListPractice_3 {
    public static void main(String[] args) {
        ArrayList <String> stringNums = new ArrayList<>();
        stringNums.add("10");
        stringNums.add("100");
        stringNums.add("101");
        stringNums.add("1000");

        System.out.println("stringNums = " + stringNums);
      //  System.out.println("stringNums.get(0)*5 = " + stringNums.get(0) * 5);


        System.out.println("toIntList(stringNums) = " + toIntList(stringNums));
        System.out.println("toIntList(stringNums).get(0)*5 = " + toIntList(stringNums).get(0) * 5);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 70, 8, 9, 10, 11, 125, 130, 14, 15, 16, 17, 18, 19, 20));

        System.out.println("getList(numbers,20) = " + getList(numbers, 10));
        System.out.println("getList_2(numbers,20) = " + getList_2(numbers, 10));
    }
    //"10","100","101","1000" sayılarını stringNums isimli arrayList e atalım.
    //toIntList(stringNums); methodu Integer bir arrayList e convert edip
    //döndürelim.

    public static ArrayList<Integer> toIntList (ArrayList<String> strList){
        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < strList.size(); i++) {
            resultList.add(Integer.valueOf(strList.get(i)));
        }

        return resultList;
    }
    //ArrayList<Integer> myList = getList(20);//return method
    //System.out.println(myList);
    //[1, 2, 3, 4, 5, 6, 70, 8, 9, 10, 11, 125, 130, 14, 15, 16, 17, 18, 19, 20]

    // parametre olarak girilenden küçük olanları listede dönen metodu yazalım..

    public static ArrayList<Integer> getList(ArrayList<Integer> arrayList, int n){
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)<n){
                resultList.add(arrayList.get(i));
            }
        }
        return resultList;
    }

    public static ArrayList<Integer> getList_2(ArrayList<Integer> arrayList, int x){
        arrayList.removeIf(integer -> integer>=x);
        return arrayList;
    }
}
