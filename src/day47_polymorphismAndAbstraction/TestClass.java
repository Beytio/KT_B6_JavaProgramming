package day47_polymorphismAndAbstraction;

public class TestClass {
    public static void main(String[] args) {
        SeaFish shark = new SeaFish();

        System.out.println(shark.name);
        System.out.println(shark.gender);
        shark.beslenme();
        shark.solunum();

        //eğer istersen child classtan ürettiğin
        //objeyi parent class data tipi ile tanımlayabilirsin.
        Fish fish = new RiverFish();


        System.out.println(fish.name); //Animal
        System.out.println(fish.color); //Rengi belli değil
        System.out.println(fish.gender); //null

        fish.hareket();  //yüzerler
        fish.beslenme();  //ot yerler

        Animals animal = new Fish();

        System.out.println(animal.name); //Animal
        animal.hareket(); //yüzerler
        animal.solunum(); //solungaç ile
        animal.beslenme(); // hem et hem de ot

       // RiverFish sazan = new Fish(); CTE
        System.out.println("-------------------");

        //instanceof  --- bir obje belirtilen classa mı ait? true ya da false döner
        System.out.println(animal instanceof Fish);  //true
        System.out.println(animal instanceof Animals);  //true
        System.out.println(animal instanceof SeaFish);  //false
        System.out.println(shark instanceof SeaFish); // true
        System.out.println(shark instanceof Animals); //true



        System.out.println("-------------------");

        System.out.println("animal.getClass() = " + animal.getClass());
        System.out.println("shark.getClass() = " + shark.getClass());

        String name = "Ali";
        System.out.println("name.getClass() = " + name.getClass());

        System.out.println("-------------------");

        System.out.println("animal.getClass().getName() = " + animal.getClass().getName());
        System.out.println("shark.getClass().getName() = " + shark.getClass().getName());
        System.out.println("name.getClass().getName() = " + name.getClass().getName());

        System.out.println("-------------------");

        System.out.println("animal.getClass().getSimpleName() = " + animal.getClass().getSimpleName());
        System.out.println("shark.getClass().getSimpleName() = " + shark.getClass().getSimpleName());
        System.out.println("name.getClass().getSimpleName() = " + name.getClass().getSimpleName());

        System.out.println("-------------------");

        System.out.println("animal.getClass().getConstructors() = " + animal.getClass().getConstructors().length);
        System.out.println("name.getClass().getConstructors() = " + name.getClass().getConstructors().length);
    }
}
