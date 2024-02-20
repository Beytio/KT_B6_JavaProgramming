package day42_staticAndInheritance;

public class C01_BasicCalculator {

    public String owner = "Musa Çözen";
    int p = 0;

    private String name ="Ali Ay";

    protected int x;

    public String getName() {
        return name.substring(0,2);
    }

    public int sum(int x , int y){
        return x+y;
    }

    public int sub(int x , int y){
        return x-y;
    }

    public void result(){
        System.out.println("Ben basic calculatorım.. bende sonuçlar en fazla 8 haneli olur");
    }

}
