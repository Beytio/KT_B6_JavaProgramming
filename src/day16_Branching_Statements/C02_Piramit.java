package day16_Branching_Statements;

public class C02_Piramit {
    public static void main(String[] args) {
        //Piramit
        //    *
        //   * *
        //  * * *
        // * * * *
        //* * * * *

        for (int i = 1; i <6 ; i++) {
            for (int j = 6; j >i ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i ; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
