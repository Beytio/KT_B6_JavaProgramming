package day49_Exceptions;

public class C05_Exceptions4 {
    public static void main(String[] args) {
        int i=2;
        int j=0;


        String str=null;


        int nums[]=new int[5];


        try {
            j=25/i;
            System.out.println(str.length());
            System.out.println(nums[5]);

        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero"+e);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Stay in limit"+e);
        }catch (Exception e){
            System.out.println("Something went wrong");
        }

        System.out.println("Bye");
    }
}
