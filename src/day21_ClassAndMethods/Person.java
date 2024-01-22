package day21_ClassAndMethods;

public class Person {

    String name;
    String surname;
    char gender;
    int age;
    String tcNo;

    public void uyu(){
        System.out.println(name+" "+surname+" uyuyor");
    }

    public void oyunOyna(){
        System.out.println(name+" "+surname+" oyun oynuyor");
    }

    public String adSoyad(){
        return name+" "+surname;
    }
}
