package day43_Inheritance_AccessModifiers;

public class C02_Child extends C01_Parent{
    int x=98;
    String parentName;

    C02_Child (String parentName){

    }


    public void childMethod(int x){
        System.out.println(x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}
