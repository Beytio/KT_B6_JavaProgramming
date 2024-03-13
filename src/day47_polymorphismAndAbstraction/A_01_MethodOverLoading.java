package day47_polymorphismAndAbstraction;

public class A_01_MethodOverLoading {
    public static void main(String[] args) {
        System.out.println(sum(2, 6, 8));
    }

    public static int sum(int x, int y){
        return x+y;
    }

    public static double sum(double x, double y, double z){
        return x+y+z;
    }

    public static double sum(int x, int y, double z){
        return x+y-z;
    }
}
