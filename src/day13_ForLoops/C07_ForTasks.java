package day13_ForLoops;

public class C07_ForTasks {
    public static void main(String[] args) {
        //Bir program yazın ve [0-100] arasındaki tüm sayıları yazdırsın.
        for (int i = 1; i < 100; i++) {
            System.out.print(i+" ");
        }

        System.out.println("-------------------");
        //Bir program yazın ve 15-100 arasındaki tüm sayıları yan yana yazdırsın.

        for (int i = 16; i < 100; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("-------------------");


        //0 dan 100 e kadar olan sayıları tersten ekrana yazdırın. (100 99 98 97 vs)

        for (int i = 100; i > 0; i--) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("-------------------");

        //Bir program yazın ve 0-100 arasındaki tüm çift sayıları yazdırsın.

        for (int i = 2; i < 100; i+=2) {
            System.out.print(i+" ");
        }


        System.out.println();
        System.out.println("-------------------");

        //Bir program yazın ve 0-100 arasındaki tüm tek sayıları yazdırsın.

        for (int i = 1; i < 100; i+=2) {
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("-------------------");

        for (int i = 1; i < 100; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }
        }


        System.out.println();
        System.out.println("-------------------");

        for (int i = 1; i < 100; i++) {
            if (i%2==1){
                System.out.print(i+" ");
            }
        }

        System.out.println();
        System.out.println("-------------------");

        //Bir program yazın ve [1-100] arasındaki sayıların toplamını konsola yazdırın

        int toplam=0;
        for (int i = 1; i < 100; i++) {
            toplam+=i;// toplam=toplam+i;
        }

        System.out.println("toplam = " + toplam);

    }
}
