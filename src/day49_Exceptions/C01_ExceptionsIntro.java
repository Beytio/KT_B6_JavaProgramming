package day49_Exceptions;

public class C01_ExceptionsIntro {
    public static void main(String[] args) {
       // System.out.println(2+2);//5   BUG olarak da adlandırılır logical error

        int i=0;// normal statement

        int j=0;

        try {
            j = 25 / i;
        }catch(Exception e){
            System.out.println("Something went wrong "+e);// ArithmeticException: / by zero
        }

        System.out.println(j);


        System.out.println("Bye");


    }
}
