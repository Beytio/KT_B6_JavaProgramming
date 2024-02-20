package day42_staticAndInheritance;

public class C03_ScientificCalculator extends C02_AdvancedCalculator{

    public double powResult(int floor , int us){
       return Math.pow(floor,us);
    }
    public void result(){
        System.out.println("Ben science için üretildim. Bizde sınır olmaz..");
    }
}
