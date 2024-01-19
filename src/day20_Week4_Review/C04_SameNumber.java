package day20_Week4_Review;

public class C04_SameNumber {
    public static void main(String[] args) {
        System.out.println("isSameNum(2,2) = " + isSameNum(2, 2));
        System.out.println("isSameNum(2,6) = " + isSameNum(2, 6));

        System.out.println("sameNumberSimpleWay(23,23) = " + sameNumberSimpleWay(23, 23));
        System.out.println("sameNumberSimpleWay(23,34) = " + sameNumberSimpleWay(23, 34));

        System.out.println("sameNumberTernary(2,2) = " + sameNumberTernary(2, 2));
        System.out.println("sameNumberTernary(3,45) = " + sameNumberTernary(3, 45));
    }

    public static boolean isSameNum(int x,int y){
        if (x==y){
            return true;
        }return false;
    }

    public static boolean sameNumberTernary(int x,int y){
        return x==y? true: false;
    }



    public static boolean sameNumberSimpleWay(int x,int y){
        return x==y;
    }



}
 /*
    Create a function that returns true when x is equal to y; otherwise return false.

    Examples
    isSameNum(4, 8) ➞ false

    isSameNum(2, 2) ➞  true

    isSameNum(42, 32) ➞  false
     */