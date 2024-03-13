package day58_JavaReview;

public class C07_MethodOverloading {
    public static void main(String[] args) {
        System.out.println(sum(2, 3));
        System.out.println(sum(2, 3, 4));
    }

    public static int sum(int x, int y){
        return x+y;
    }

    public static int sum(int x, int y, int z){
        return x+y+z;
    }

    public static double sum(double x, double y, double z){
        return x+y-z;
    }

    public static double sum(double x, double y, int z){
        return x+y+z;
    }

    public static double sum(double x, int y, int z){
        return x-y-z;
    }
}
