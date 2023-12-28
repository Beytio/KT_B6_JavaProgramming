package day04_variables;

public class C03_DeclaringMultipleVariables {
    public static void main(String[] args) {
        int i = 5, j, k;

        j = 80;
        k = j + i;
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);

        System.out.println(i+j+k);

        char ch, ch1='s',ch3;

        ch3 = 'm';
        ch3 = '2';
        char ch4=98;  //b nin ascii değeri

     //   int ch3;  hata verir. çünkü tanımlı

        System.out.println(ch3);
        System.out.println(ch4);


    }
}
