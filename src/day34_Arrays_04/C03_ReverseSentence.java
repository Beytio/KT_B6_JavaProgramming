package day34_Arrays_04;

public class C03_ReverseSentence {
    public static void main(String[] args) {
        System.out.println("reverseSentence(\"Java öğrenmek çok güzel\") = " + reverseSentence("Java öğrenmek çok " +
                "güzel"));

        String [] strings = {"Ali","annesini","çok","seviyor"};
        String joined = String.join("+", strings);
        System.out.println("joined = " + joined);

    }


    // girilen cümleyi kelime olarak tersten veren metodu yazınız..
    //Ali okula gitti  --- gitti okula Ali
    // Java öğrenmek çok güzel   -- güzel çok öğrenmek Java

    public static String reverseSentence (String cumle){
        String terstenCumle = "";
        String [] kelimeler =cumle.split(" ");

        for (int i = kelimeler.length-1; i >=0 ; i--) {
            terstenCumle += kelimeler[i]+" ";
        }
        return terstenCumle.trim();
    }

}
