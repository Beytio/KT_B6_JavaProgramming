package day09_OperatorsCont;

public class C07_ClassTask {
    public static void main(String[] args) {

        int odenecekTutar=1130;
        int hesap=odenecekTutar;
        System.out.println("hesap = " + hesap);

        int ikiyuzluk=hesap/200;
        hesap%=200;

        System.out.println("hesap = " + hesap);

        int yuzluk=hesap/100;
        hesap%=100;

        System.out.println("hesap = " + hesap);

        int yrimilik=20;
        hesap%=20;

        System.out.println("hesap = " + hesap);

        int onluk=hesap/10;

        System.out.println(odenecekTutar+" Tl için "+ikiyuzluk+" tane ikiyüzlük "+yuzluk
                +" tane yuzluk "+yrimilik+" tanne yirmilik "+onluk+" tane onluk gerekmektedir");



    }
}
