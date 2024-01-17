package day18_CustomMethods;

public class C04_PracticeTasks {
    public static void main(String[] args) {

       //System.out.println("Math.max(23,14) = " + Math.min(23, 14));

        int a=5;
        double boyaUcreti=0;
        boyaUcreti=areaOfCircle(5)*150;

        System.out.println("areaOfSquare(a) = " + areaOfSquare(a));
        // bahcemin kenarına 3 sıra tel çektirecem ne kadar tel gerekli hesapla

        double gerekenTel=perimeterOfSquare(120)*3;
        System.out.println("gerekenTel = " + gerekenTel);


    }


    /**
     * this method calculates the area of a circle wirh given radius
     * @param radius
     */
    public static double areaOfCircle(int radius){
        double area;
        //area=Math.PI*radius*radius;
        area=Math.PI*Math.pow(radius,2);
      //  System.out.println("area = " + area);
        return area;
    }


    /**
     * method that can calculate the area of a square
     * @param kenar
     * @return
     */
    public static int areaOfSquare(int kenar){return kenar*kenar;}

    public static int perimeterOfSquare(int kenar){return 4*kenar;}





}
//	create a method that can calculate the area of a circle Pi*r*r
//	create a method that can calculate the area of a square