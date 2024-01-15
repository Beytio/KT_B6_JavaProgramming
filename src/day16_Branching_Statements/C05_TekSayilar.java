package day16_Branching_Statements;

public class C05_TekSayilar {
    public static void main(String[] args) {
        // 1 den 100 e kadar tek sayıları continue kullanarak yazdırın


        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
        // bu sefer çiftleri yazdıralım
        int x = 0;
        while (x<=100){
            x++;
            if (x%2==1){
                continue;
            }
            System.out.println(x);
            if (x>60){
                break;
            }


        }
    }
}
