package day35_Week07_Review;

import java.util.Arrays;

public class C02_ArrayIntro {
   public static void main(String[] args){

      int [] nums;
      int [] scores;

      int [] numbers=new int[4];
      System.out.println("numbers = " + numbers);

      System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));

      String [] str=new String[3];
      str[0]="Ali";
      str[1]="Veli";

      System.out.println("Arrays.toString(str) = " + Arrays.toString(str));

      double[] doubleNums=new double[2];

      boolean[] bool=new boolean[1];

      System.out.println("Arrays.toString(doubleNums) = " + Arrays.toString(doubleNums));
      System.out.println("Arrays.toString(bool) = " + Arrays.toString(bool));

      char[] chars=new char[2];
      System.out.println("Arrays.toString(chars) = " + Arrays.toString(chars));

      float [] floats=new float[2];
      System.out.println("Arrays.toString(floats) = " + Arrays.toString(floats));

      int [] myNums={5,7,9,15};
      System.out.println("myNums.length = " + myNums.length);


   }

}
