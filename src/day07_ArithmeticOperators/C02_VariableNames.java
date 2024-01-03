package day07_ArithmeticOperators;

public class C02_VariableNames {
    public static void main(String[] args) {
        //** variable isimleri/adları harf (a-z/A-Z) ya da _ (alt tire underscore) ya da $ (dolar işareti) ile
        // başlayabilir.
        // int 3a=32;  //olmaz
        int _3a = 32;  //olur
        int $3a = 32;  //olur
        int a = 32;   //olur
        // int .as =32;  //olmaz çünkü ilk karakter . olmaz
        int A2 = 32; //olur

        // ** variable isimlerinde bir çok özel karakter kullanılamaz. (*, / , + , -, \ , @ , ! )
        int e€ = 32; //olur
        //int e*=32; //olmaz
        //int e/=32; //olmaz
        // int e-=32;  //olmaz
        // int e?=32;  //olmaz
        // int a,2=25;  //olmaz

        //** variable isimleri tanımadıkları değere uygun verilir..
        //  yani yaş için age, yıl için year gibi kelimeler kullanılır.

        int age = 32;  // yaş tanımlaması yapılmıştır.
        double area;  // alan için uygun tanımlamadır.

        //** variable isinlerinde boşluk olmaz
        // int hasan age=32;  // boşluk bulunamaz..

        //convention yani uygun ad verme kuralları
        // bunlar kodda hata vermez ama uyulursa uygun olur.
        // 1. variable isimleri küçük harfla başlar
        //2. iki kelimeden oluşacaksa ya camelCase gibi yazılır. yani ilk kelimenin ilk harfi küçük
        // ikinci kelimenin ilk harfi büyük olur. Ya da camel_case şeklinde araya alt tire konularak yazılır.
        int hasanAge = 20;
        int numberOfPopulation;
        int number_of_population;

        //sadece ingilizce karakter kullanılmalıdır. hata vermeyebilir ama ing. dışı kullanılmaz.

        String nameofpresident = "Joe Biden";  // kod çalışır ama uygun kullanım değildir.
        String nameOfPresident = "Joe Biden";  // uygun kullanımdır.

        System.out.println(nameofpresident);
        System.out.println(nameOfPresident);

        //* java tarafından reserve edilen bazı kelimer variable ismi olarak kullanılmaz
      //  int int =32;  //olmaz

         // int final = 32;  //olmaz

        //int static = 32; // olmaz

        int java=32;
        int Java=32;

        int süper=25;


    }
}
