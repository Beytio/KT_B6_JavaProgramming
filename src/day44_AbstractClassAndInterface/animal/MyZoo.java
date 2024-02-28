package day44_AbstractClassAndInterface.animal;

import day21_ClassAndMethods.Main;

public class MyZoo {
    public static void main(String[] args) {
       // Animal animal=new Animal("Monkey", "Scottish",'m',4,"Medium", "Gray");
        // Can not create objects from abstract class

        //CanFly canFly=new CanFly();
        // Can not create objects from interface

        Cat cat=new Cat("Bulut", "Scottish", 'm', 6,"Medium", "Black");
        System.out.println(cat);
        cat.eat();
        cat.play();
        cat.meow();
        cat.drinkWater();


        Dog dog=new Dog("Karabaş","Malaklı",'f', 7, "Large", "Black and white");
        System.out.println(dog.getAge());
        dog.setAge(12);
        System.out.println(dog.getAge());
        dog.bark();
        dog.play();
        System.out.println(dog);




    }
}
