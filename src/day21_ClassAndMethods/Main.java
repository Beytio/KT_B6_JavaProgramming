package day21_ClassAndMethods;

public class Main {
    public static void main(String[] args) {
        // non-primitive veri tipler new keywordu ile oluşturulur.
/*
        Person person1 = new Person();

        person1.name = "Aysun";
        person1.surname = "Ayık";
        person1.age = 34;
        person1.gender = 'K';
        person1.tcNo = "12345678";
        person1.uyu();
        person1.oyunOyna();
        System.out.println("person1.adSoyad() = " + person1.adSoyad());
        String adSoyad = person1.adSoyad();
        System.out.println("adSoyad = " + adSoyad);

        Person person2= new Person();
        person2.name="Ali";
        person2.surname="Sarı";
        person2.age=32;
        person2.oyunOyna();
        person2.uyu();
        System.out.println("person2.adSoyad() = " + person2.adSoyad());

        System.out.println("person1.name = " + person1.name);
        System.out.println("person2.name = " + person2.name);


        Dog dog1 = new Dog();
        dog1.isim = "Karabaş";
        dog1.cins = "Kangal";
        dog1.renk = "Beyaz";
        dog1.kisirMi=true;

        dog1.havla();

        Dog dog2 = new Dog();
        dog2.isim = "Akbaş";
        dog2.cins = "Bulldog";


        dog2.havla();

        System.out.println("dog1.renk = " + dog1.renk);
        System.out.println("dog2.renk = " + dog2.renk);

        System.out.println("dog1.kisirMi = " + dog1.kisirMi);
        System.out.println("dog2.kisirMi = " + dog2.kisirMi);


        Car car1 = new Car();
        car1.marka = "Mazda";
        car1.model = "Mazda 3";
        car1.renk = "Siyah";
        car1.hiz = 220;

        car1.calistir();
        car1.hizlan();
        car1.dur();

        System.out.println("car1.model = " + car1.model);


        Circle circle1=new Circle();
        circle1.radius=2.0;

        System.out.println("circle1.area() = " + circle1.area());
        System.out.println("circle1.perimeter() = " + circle1.perimeter());
        System.out.println("circle1.radius = " + circle1.radius);
        */

        Musteri musteri1= new Musteri();
        musteri1.ad="Selma";
        musteri1.soyad="Kırcı";
        musteri1.adres="Beylikdüzü";
        musteri1.tcNo="858552552";
        musteri1.yas =36;

        System.out.println("musteri1.sifre() = " + musteri1.sifre());
    }
}
