package day03_Comments_variables;

public class C04_EscapeCharcters {

    public static void main(String[] args){

        //   \n   ->  Yeni satır
        //   \t   ->  Bir tab boşluk bırak
        //   \b   ->  Backspace
        //   \"   ->   "
        //   \\   ->   \
        //   \r   ->   Satır başı


        //  "Merhaba Dünya"
        //  \Merhaba Dünya\
        //  'Merhaba Dünya'
        System.out.println("Merhaba\nDünya ");
        System.out.println("Merhaba\tDünya ");
        System.out.println("Merhaba\bDünya ");
        System.out.println("\"Merhaba Dünya\" ");
        System.out.println("\\Merhaba Dünya\\ ");

        // there is no chars for ' you can write it in the string
        System.out.println("'Merhaba Dünya'");


        String name="Nisa";
        int age=22;

    }

}


