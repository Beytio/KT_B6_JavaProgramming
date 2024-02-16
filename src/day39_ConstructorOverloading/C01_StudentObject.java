package day39_ConstructorOverloading;

public class C01_StudentObject {
    public static void main(String[] args) {
        Student student=new Student();
        System.out.println(student);
        student.age=23;
        student.id=1234;
        student.name="Fatma";
        System.out.println(student);

        Student student1=new Student("Hacer",23,'f', 12345);

        System.out.println(student1);

    }
}
