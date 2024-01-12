package day15_Week3_review;

public class C04_SumOfOddNumbers {
    public static void main(String[] args) {

        int toplam=0;
        for (int i = 0; i <100 ; i++) {

           if (i%2!=0){
               toplam+=i;
           }

        }

        System.out.println("-----------------");


        int toplam2=0;
        for (int i = 1; i <100 ; i+=2) {
                toplam2+=i;
        }


        System.out.println("---------------------");


        for (int i = 0; i < 100; i++) {
            System.out.print(i+" ");
        }


        System.out.println();
        System.out.println("---------------------");


        for (int i = 11; i < 90; i+=3) {
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("---------------------");


        for (int i = 100; i > 0; i--) {
            System.out.print(i+" ");
        }
    }
}
