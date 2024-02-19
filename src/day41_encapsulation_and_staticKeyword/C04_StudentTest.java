package day41_encapsulation_and_staticKeyword;

public class C04_StudentTest {
    public static void main(String[] args) {
        C03_Student student1 = new C03_Student();
        System.out.println("student1 = " + student1);

        C03_Student student2 = new C03_Student("Ali Ay");
        System.out.println("student2 = " + student2);

        student2.okulAdi="Seyit Gazi";

        System.out.println("student2 = " + student2);
        System.out.println("student1 = " + student1);

        C03_Student.okulAdi = "Melik Gazi Orta Okul";

        System.out.println("student2 = " + student2);
        System.out.println("student1 = " + student1);

//        student2.temizlikKurallari();
//        student1.temizlikKurallari();

        C03_Student.temizlikKurallari();

        System.out.println("kutupSifre : "+student2.kutuphaneSifresi());

        System.out.println(student2.getAdSoyad());

        student1.setAdSoyad("Gönül Bağcı");
        student1.setOkulNo(665);

        System.out.println("kutupSifre : "+student1.kutuphaneSifresi());

        C03_Student student3= new C03_Student("Şerife Topkara",558,"Selçuk",false,'f');

    }
}
