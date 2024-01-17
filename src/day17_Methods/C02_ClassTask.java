package day17_Methods;

import java.util.Scanner;

public class C02_ClassTask {
    public static void main(String[] args) {
        //Nested loop kullanarak kullanıcıdan hangi işlemi yapmak
        // istediğini sorun. 1-toplama 2-Çıkarma 3-çarpma 4-bölme 5-çıkış
        // kullanıcının isteğine göre işlem yapın. Kullanıcının seçimine göre Girilen ekrandan
        // 2 sayı alın ve işlemin sonucunu ekrana yazın çıkmak sonuç 0  devam etmek için 1 girmesini isteyin.


        // 1-toplama 2-Çıkarma 3-çarpma 4-bölme 5-çıkış
        // 2 derse    çıkarma menüsüne hoş geldiniz
        // x:
        // y:
        // result;
        // bir üst menü  için 0 işlemlere devam etmek için 1 giriniz


        Scanner scanner=new Scanner(System.in);

        while(true){
                System.out.println("1-toplama 2-Çıkarma 3-çarpma 4-çıkış : ");
                int tercih=scanner.nextInt();
                if (tercih==1) {
                            while (true) {
                                System.out.println("1. sayi :");
                                int x = scanner.nextInt();
                                System.out.println("2. sayi :");
                                int y = scanner.nextInt();

                                System.out.println("İki sayının toplamı = " + (x + y));

                                System.out.println("Bir üst menü için 0, işleme devam etmek için 1 e basınız");
                                int tercih2 = scanner.nextInt();
                                if (tercih2 == 0) {
                                    break;
                                } else if (tercih2 == 1) {
                                    continue;
                                } else {
                                    System.out.println("Hatalı giriş");
                                    break;
                                }
                            }
                }else if (tercih==2) {
                while (true) {
                    System.out.println("1. sayi :");
                    int x = scanner.nextInt();
                    System.out.println("2. sayi :");
                    int y = scanner.nextInt();

                    System.out.println("İki sayının farkı = " + (x - y));

                    System.out.println("Bir üst menü için 0, işleme devam etmek için 1 e basınız");
                    int tercih2 = scanner.nextInt();
                    if (tercih2 == 0) {
                        break;
                    } else if (tercih2 == 1) {
                        continue;
                    } else {
                        System.out.println("Hatalı giriş");
                        break;
                    }
                }
                }else if (tercih==3) {
                while (true) {
                    System.out.println("1. sayi :");
                    int x = scanner.nextInt();
                    System.out.println("2. sayi :");
                    int y = scanner.nextInt();

                    System.out.println("İki sayının çarpımı = " + x * y);

                    System.out.println("Bir üst menü için 0, işleme devam etmek için 1 e basınız");
                    int tercih2 = scanner.nextInt();
                    if (tercih2 == 0) {
                        break;
                    } else if (tercih2 == 1) {
                        continue;
                    } else {
                        System.out.println("Hatalı giriş");
                        break;
                    }
                }
            } else if (tercih==4) {
                    break;
                }
                else {
                    System.out.println("Hatalı giriş yaptınız");
                }

        }




    }
}
