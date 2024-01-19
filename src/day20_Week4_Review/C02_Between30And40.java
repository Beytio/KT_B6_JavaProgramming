package day20_Week4_Review;

public class C02_Between30And40 {
    public static void main(String[] args) {
        System.out.println("between30And40(34,37) = " + between30And40(34, 37));
        System.out.println("between30And40(25,37) = " + between30And40(25, 37));
        System.out.println("between30And40(25,45) = " + between30And40(25, 45));
        System.out.println("between30And40(35,45) = " + between30And40(35, 45));

        between30And40(12,34);


        boolean nameChecked= checkName("Fatma");
    }


    public static boolean between30And40(int a , int b){
        if (a>=30 && a<=40 && b>=30 && b<=40){
            return true;
        }
        return false;
    }





    public static boolean checkName(String  name){
        if(name.equals("Ayşe")){
            return true;
        }return false;
    }





}
 /*
    Create a method that returns true, if Given 2 int values are both in the range 30..40 inclusive
    Verilen 2 int değerinin her ikisi de 30 ile 40 (dahil) aralığında ise true değerini döndüren bir metot yazın

in3040(30, 31) → true
in3040(30, 41) → false
  */