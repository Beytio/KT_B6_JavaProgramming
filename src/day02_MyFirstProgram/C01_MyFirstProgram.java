
package day02_MyFirstProgram;

import day19_ReturnMethodsAndMethodOverloading.C03_Faktoriyel;
import day41_encapsulation_and_staticKeyword.C01_AccessModifier;

public class C01_MyFirstProgram {

    public static void main(String[] args){
       System.out.println("Merhaba Dünya");
        // hoca dedi ki ders çalışın
        // jkjsa

        /*
        hdsklfhl
        dshflkjsdf
        jghkjfhsd
        jhjksd
        fjgkjsd
        gkjsdf

         */
      //  System.out.println("C03_Faktoriyel.faktoryelHesaplama(5) = " + C03_Faktoriyel.faktoryelHesaplama(5));

        // public access modifierı anlatmak için sonradan eklenmiştir. (day41)
        System.out.println(C01_AccessModifier.hospitalName);
        C01_AccessModifier accessModifier = new C01_AccessModifier();
        System.out.println(accessModifier.hospitalName_1);
    }


}
