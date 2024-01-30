package day27_String_Lab_Cont;

import java.util.Scanner;

public class C04_WriteSurname {
    public static void main(String[] args) {
        writeSurname();
    }

    /*
    Kullanıcının konsoldan ad ve soyad bilgilerini konsoldan alın
    Ekrana "Soy isminiz ..(soyad).. dır." Yazan metodu yazınız.
    İnput: "Harun Özsoy "
    Output: "Soy isminiz Özsoy dır."
    İnput:" Harun Kenan Özsoy "
    Output: "Soy isminiz Özsoy dır."
    İnput: "Harun Kenan Can Özsoy "
    Output: "Soy isminiz Özsoy dır."
    İnput:" Harun Kenan Can Sami Özsoy"
    Output: "Soy isminiz Özsoy dır.

     */

    public static void writeSurname(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adınızı/Adlarınızı ve soyadınızı aralarında boşluk bırakacak şekilde giriniz");
        String adSoyad = scanner.nextLine();

        int lastIndexOfSpace = adSoyad.lastIndexOf(" ");
        String soyad = adSoyad.substring(lastIndexOfSpace+1);
        System.out.println("Soy isminiz "+soyad+"'dır.");
    }
}
