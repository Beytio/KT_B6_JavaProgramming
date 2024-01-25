package day23_StringClass;

public class C03_StringMethods {
    public static void main(String[] args) {
        String a="Hasan";


        String programmingLanguage="Java";// literal way Heap memory--- String Pool
        System.out.println("programmingLanguage = " + programmingLanguage);

        programmingLanguage="Pyhton";// String Pool da yeni bir obje  oluşturdu, string immutable olduğu için java pool da kaldı
        System.out.println("programmingLanguage = " + programmingLanguage);

        // length()
        System.out.println("programmingLanguage.length() = " + programmingLanguage.length());

        System.out.println("--------------------");

        // toLowerCase() , toUpperCase()

        System.out.println("programmingLanguage.toLowerCase() = " + programmingLanguage.toLowerCase());
        System.out.println("programmingLanguage.toUpperCase() = " + programmingLanguage.toUpperCase());

        System.out.println("programmingLanguage = " + programmingLanguage);

        programmingLanguage=programmingLanguage.toUpperCase();

        System.out.println("programmingLanguage = " + programmingLanguage);

        System.out.println("----------------------");

        // charAt() ------  proglan= P H Y T O N
        //                           0 1 2 3 4 5

        System.out.println("programmingLanguage.charAt(5) = " + programmingLanguage.charAt(5));
        System.out.println("programmingLanguage.charAt(3) = " + programmingLanguage.charAt(3));
    //    System.out.println("programmingLanguage.charAt(6) = " + programmingLanguage.charAt(-1));
        System.out.println("programmingLanguage.charAt(programmingLanguage.length()-1) = " + programmingLanguage.charAt(programmingLanguage.length() - 1));
        System.out.println("programmingLanguage = " + programmingLanguage);

        System.out.println("============================================");
        // concat()
        System.out.println(programmingLanguage+" programming Language");
        System.out.println("programmingLanguage.concat(\" programming Language\") = " + programmingLanguage.concat(" programming Language"));
        String str=" programming Language";
        System.out.println(programmingLanguage.concat(str));


        System.out.println("=======================================");

        System.out.println("programmingLanguage = " + programmingLanguage);
        programmingLanguage=programmingLanguage.concat(str);
        System.out.println("programmingLanguage = " + programmingLanguage);

        // contains()   --- boolean değer döndürür

        System.out.println("programmingLanguage.contains(\"YH\") = " + programmingLanguage.contains("YH"));
        System.out.println("programmingLanguage.contains(\"HY\") = " + programmingLanguage.contains("HY"));
        System.out.println("programmingLanguage.contains(\"h\") = " + programmingLanguage.contains("h"));

        programmingLanguage="    Java programming Language    ";
        System.out.println("programmingLanguage = " + programmingLanguage);
        System.out.println("programmingLanguage.contains(\"Java\") = " + programmingLanguage.contains("Java"));


        System.out.println("-----------------------------------");

        // trim()
        System.out.println("programmingLanguage = " + programmingLanguage);
        System.out.println("programmingLanguage.trim() = " + programmingLanguage.trim());
        System.out.println("programmingLanguage = " + programmingLanguage);


        System.out.println("-----------------------------------------");

        // replace()
        System.out.println("programmingLanguage = " + programmingLanguage);
        System.out.println("programmingLanguage.replace(\" \",\"\") = " + programmingLanguage.replace(" ", ""));
        System.out.println("programmingLanguage = " + programmingLanguage);
        programmingLanguage=programmingLanguage.replace(" ","");
        System.out.println("programmingLanguage = " + programmingLanguage);

        System.out.println("programmingLanguage.replace(\"Java\",\"Phyton\") = " + programmingLanguage.replace("Java", "Phyton"));


        System.out.println("-----------------------------");


        System.out.println("programmingLanguage = " + programmingLanguage);

        // equals()
        String str1="hello";
        String str2="Hello";
        String str3=new String("hello");
        String str4=new String("HELLO");
        String str5="hello";

        System.out.println("str2.toLowerCase().equals(str4.toLowerCase()) = " + str2.toLowerCase().equals(str4.toLowerCase()));


        System.out.println("str1.equals(str2) = " + str1.equals(str2));
        System.out.println("str1.equals(str3) = " + str1.equals(str3));
        System.out.println("str2.equals(str3) = " + str2.equals(str3));

        System.out.println("------------------------------------");

        // equalsIgnoreCase()
        System.out.println("str1.equalsIgnoreCase(str4) = " + str1.equalsIgnoreCase(str4));
        System.out.println("str3.equalsIgnoreCase(str4) = " + str3.equalsIgnoreCase(str4));



    }
}
