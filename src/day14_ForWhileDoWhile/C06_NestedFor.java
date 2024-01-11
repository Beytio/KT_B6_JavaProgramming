package day14_ForWhileDoWhile;

public class C06_NestedFor {
    public static void main(String[] args) {
        /*
        1 1 1 1 1 1
        1 1 1 1 1 1
        1 1 1 1 1 1
        1 1 1 1 1 1
        1 1 1 1 1 1
        1 1 1 1 1 1
        nested loop kullanarak yazdıralım
        */

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <=6 ; j++) {
                System.out.print(1+" ");
            }
            System.out.println();
        }

        System.out.println("---------------------");

        /*
        * * * * *
        * * * * *
        * * * * *
        * * * * *
        nested loop kullanarak yazdıralım
         */
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <=5 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("---------------------");

        /*

         *
         **
         ***
         ****
         *****
         ******
         nested loop kullanarak yazdıralım
         */
        for (int i = 1; i <=6 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("---------------------");
        /*

         ******
         *****
         ****
         ***
         **
         *
          nested loop kullanarak yazdıralım
         */

        for (int i = 6; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
