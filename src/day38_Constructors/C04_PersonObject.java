package day38_Constructors;

public class C04_PersonObject {
    public static void main(String[] args) {

        Person person=new Person();
        System.out.println("person.age = " + person.age);
        System.out.println("person.gender = " + person.gender);
        System.out.println("person.name = " + person.name);

        person.age=35;
        person.name="Mehmet";
        person.gender='M';

        System.out.println("person.age = " + person.age);
        System.out.println("person.gender = " + person.gender);
        System.out.println("person.name = " + person.name);

        Person person1=new Person("Ali",'M',24);

        System.out.println("person1.age = " + person1.age);
        System.out.println("person1.name = " + person1.name);
        System.out.println("person1.gender = " + person1.gender);

        person1.name="Ayşe";
        person1.gender='F';


        System.out.println("person1.age = " + person1.age);
        System.out.println("person1.name = " + person1.name);
        System.out.println("person1.gender = " + person1.gender);

        //System.out.println(person1);

        System.out.println("person1.toString() = " + person1.toString());
        System.out.println(person1);

        System.out.println("-----------------");

        Person person2=new Person();

        System.out.println(person2);


    }
}
