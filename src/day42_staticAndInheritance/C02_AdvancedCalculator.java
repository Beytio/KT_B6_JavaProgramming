package day42_staticAndInheritance;

public class C02_AdvancedCalculator extends C01_BasicCalculator{
    public String owner = "Serap Kılavuz";
    public int multiply(int x , int y){
        return x*y;
    }

    public double divide(double x , double y){
        return x/y;
    }

    public void result(){
        System.out.println("Ben advanced calculatorım.. bende sonuçlar en fazla 12 hanelidir");
    }
}
