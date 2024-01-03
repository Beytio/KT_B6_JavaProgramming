package day07_ArithmeticOperators;

public class C03_ArithmeticOperators {
    public static void main(String[] args) {
        //Ali 1990 yılında doğmuştur. Ali kaç yaşındadır?
        int mevcutYil = 2024;
        int aliDogumYil = 1990;

        int aliYas=mevcutYil-aliDogumYil;

        System.out.println("aliYas = " + aliYas);

        //Ali ile Ahmet kardeştir. Ali 1990 yılında doğmuştur. Ali ,Ahmet
        //den 5 yaş büyük olduğuna göre Ahmet kaç yaşındadır.

        int ahmetYas = aliYas-5;
        System.out.println("ahmetYas = " + ahmetYas);

       // int aliYas_1=2024-1990;  // bu türlü tanımlamalar yanlıi değil ama bizim işimizi kolaylaştırmaz.

        System.out.println("----------------------------------");

        //  3 cm yarıçapına sahip dairenin alanı ve çevresini hesaplayın?
        // (PI=3.14)

        double r = 3;
        double PI = 3.14;

        // çemberin alan formülü alan = r*r*PI

        double area = r*r*PI;

        // çemberin çevre formülü çevre = 2*r*PI

        double perimeter = 2*r*PI;

        System.out.println(r+" yariçaplı çemberin alanı : "+area+" çevresi "+perimeter+"'dir.");

        System.out.println("----------------------------------");

        //300 Fahrenheit kaç Celsius ‘dur?
        // (°C=(°F-32)/1.8)

        double f=300;
        double c=(f-32)/1.8;

        System.out.println(f +" Fahreneit'ın celcius değeri : " +c+"'dir.");

        System.out.println("----------------------------------");

        //32 Celsius kaç Fahrenheit ‘dır? (F=C*1.8+32)

        double celcius=32;
        double fahreneit=celcius*1.8+32;

        System.out.println("fahreneit = " + fahreneit);


    }
}
