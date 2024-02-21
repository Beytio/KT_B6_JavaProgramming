package day43_Inheritance_AccessModifiers;

public class C11_A {


    public void show(){
        System.out.println("In show A");
    }

    public void config(){
        System.out.println("In config");
    }



    // Method Overloading
    public void show(String str){
        System.out.println("str = " + str);
    }
}
