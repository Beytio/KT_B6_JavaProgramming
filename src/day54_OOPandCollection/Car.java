package day54_OOPandCollection;

public abstract class Car {
    public abstract void drive();
}

abstract class Honda extends Car{

}

class CRV extends Honda{
    public void drive(){
        System.out.println("Güzel çalışır");
    }
    public void fuel(){
        System.out.println("Dizel ile çalışır");
    }
}


class Jazz extends Honda{
    public void drive(){
        System.out.println("Yavaş çalışır");
    }
    public void fuel(){
        System.out.println("Benzin ile çalışır");
    }
}


// Honda myHonda=new Honda();  --- üretemeyiz --- abstract
// Car myCar=new Car();
// Honda myHonda=new CRV();
// myHonda=new Jazz();
