package day04_variables;

public class C05_Currencies {
    public static void main(String[] args) {
        //1000 $ ın para birimleri değeri

        int dollar=1000;

        double lira=dollar*29.74;
        double euro=dollar*0.94;
        double jpy=dollar*145.58;
        double pound=dollar*0.75;
        double cad=dollar*1.11;
        double yuan=dollar*7.25;

        System.out.println("lira = " + lira);
        System.out.println("euro = " + euro);
        System.out.println("jpy = " + jpy);
        System.out.println("pound = " + pound);
        System.out.println("cad = " + cad);
        System.out.println("yuan = " + yuan);
    }
}
