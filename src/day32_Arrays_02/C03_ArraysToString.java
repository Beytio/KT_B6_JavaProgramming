package day32_Arrays_02;

import java.util.Arrays;

public class C03_ArraysToString {


    public static void main(String[] args) {
        String [] arr=new String[4];
        arr[0]="Mehmet";
        arr[1]="Ahmet";
        arr[2]="Nisa";
        arr[3]="Tugba";


        int [] sayilar=new int[5];
        sayilar[0]=4;
        sayilar[1]=42;
        sayilar[2]=12;
        sayilar[3]=23;
        sayilar[4]=54;


        System.out.println(Arrays.toString(sayilar));


        String str= Arrays.toString(arr);
        System.out.println(str);


        System.out.println("----------------");


        System.out.println(toString(sayilar));




    }
    //   [4, 42, 12, 23, 54]

    // method OverLoading



    public static String toString(int [] arr){
        String result="[";
        for (int i = 0; i < arr.length; i++) {
            if (i== arr.length-1){
                result+=arr[i]+"]";
            }else {
                result += arr[i] + ", ";
            }
        }
        return result;
    }




    public static String toString(String [] arr){
        String result="[";
        for (int i = 0; i < arr.length; i++) {
            if (i== arr.length-1){
                result+=arr[i]+"]";
            }else {
                result += arr[i] + ", ";
            }
        }
        return result;
    }



    public static String toString(float [] arr){
        String result="[";
        for (int i = 0; i < arr.length; i++) {
            if (i== arr.length-1){
                result+=arr[i]+"]";
            }else {
                result += arr[i] + ", ";
            }
        }
        return result;
    }

}
