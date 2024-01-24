package day23_StringClass;

public class C02_StringIntro {


    public static void main(String[] args) {
        String str1="hello";  // literal way ;   --->  heap Memory----> String Pool "hello" oluşturur
        String str2="hello";  // str2---->    String Pool ----> "hello" yu işaret etti
        String str3="Hello"; // literal way ;   --->  heap Memory----> String Pool "Hello"

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);

        String str4=new String("hello");// String objesi -----> heap memory

        System.out.println("str4 = " + str4);


        System.out.println("(str1==str2) = " + (str1 == str2));// Asla Stringleri == ile karşılalştırmayınız
        System.out.println("(str1==str4) = " + (str1 == str4));
        System.out.println("str1.equals(str4) = " + str1.equals(str4));


        boolean bl;
        bl= str1==str2;
        System.out.println("bl = " + bl);

        bl= str2==str4;//   false cunku farklı objeler biri string poolda diğer ayrı bir obje
        System.out.println("bl = " + bl);

        bl= str1.equals(str4);// true verir cunku içerik kontrolu yapar refansına bakmaz

        System.out.println("bl = " + bl);




    }
}
