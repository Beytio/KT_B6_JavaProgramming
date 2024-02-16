package day39_ConstructorOverloading;

public class Student {
    public String name;
    public int age;
    public char gender;
    public int id;

    public Student(){
       // this();
    }



    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }



    public Student(String name, int age, char gender, int id){

        this(name, age);


        this.gender=gender;
        this.id=id;

    }


    @Override
    public String toString() {
       // this();
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                '}';
    }
}
