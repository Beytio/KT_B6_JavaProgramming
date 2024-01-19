package day20_Week4_Review;

public class C05_DoubleTheSum {
    public static void main(String[] args) {
        System.out.println("doubleTheSum(2,2) = " + doubleTheSum(2, 2));
        System.out.println("doubleTheSum(23,45) = " + doubleTheSum(23, 45));

    }


    public static int doubleTheSum(int a,int b){
        int sum;
        if (a==b){
            sum=2*(a+b);
        }else {
            sum=a+b;
        }

        return sum;
    }




}
