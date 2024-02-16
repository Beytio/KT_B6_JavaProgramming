package day39_ConstructorOverloading;

public class C04_PersonObject {
    public static void main(String[] args) {
        Person person=new Person();
   //     ahmet.age=23;
     //   System.out.println(ahmet.age);

        System.out.println(person.getName());

        person.setName("Ayşe");
        System.out.println(person.getName());

        System.out.println(person.getAge());
        person.setAge(-35);
        System.out.println(person.getAge());

        System.out.println(person.toString());


    }
}
