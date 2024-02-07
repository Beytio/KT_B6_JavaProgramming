package day33_Arrays_03;

import java.util.Arrays;

public class C02_Alphabet {
    public static void main(String[] args) {
        char[] alphabet;
        alphabet=new char[26];// instantiate

        System.out.println("alphabet = " + alphabet);

        System.out.println("--------------");

        char[]charArr={'1','2','3'};
        int[] intArr={1,2,3,4,5,6};

        System.out.println(intArr);// referance
        System.out.println(Arrays.toString(intArr));

        // when u print char Arr System.out.println (), Java implicitly converts each char in the array
        System.out.println(charArr);

        System.out.println("---------------------");
        char ch='A';

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i]=ch;
            ch++;
        }

        System.out.println(alphabet);
        System.out.println("Arrays.toString(alphabet) = " + Arrays.toString(alphabet));


        // alfabeyi 'z' harfinden başllayarak tersten yazdırın



    }
}
