package day12_If_SwitchCase;

public class C06_SwitchCase {
    public static void main(String[] args) {
        // byte , short, int, String, char tipindeki değişkenleri karşılaştırmak için kullanılır

        System.out.println("Program başladı");

        int sayi=21;

        switch (sayi){
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            default:
                System.out.println("D");
        }


        System.out.println("Program bitti");
    }
}
