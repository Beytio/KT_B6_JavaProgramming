package day20_Week4_Review;

public class C03_DivisibleBy3Or5 {
    public static void main(String[] args) {

        while (divisible(15)){
            System.out.println("");
        }



    }

    public static boolean divisible(int num){
        if (num%3==0 ||num%5==0){
            return true;
           // System.out.println(true);
        }
      //  System.out.println(false);
        return false;

    }




    /*
    girilen sayı 3 e veya 5 bölünenbiliyorsa true bölünemiyorsa false
     */
}
