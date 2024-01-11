package day14_ForWhileDoWhile;

public class C07_WhileLoop {
    public static void main(String[] args) {

        // 20 kere merhaba dünya yazdırın (while)

        int sayi = 1;

        while (sayi <= 20) {
            System.out.println("Merhaba Dünya");
            sayi++;
        }

        System.out.println("sayi = " + sayi);

        System.out.println("------------");

        for (int i = 100; sayi <= 30; sayi++, i += 5) {
            System.out.println("Merhaba Dünya");
            System.out.println("i = " + i);
        }
    }
}
