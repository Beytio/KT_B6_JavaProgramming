package day24_StringClassCont;

public class C04_Substring {
    public static void main(String[] args) {
        String cumle = "Ahmet evden okula gidiyor";
                      //012345678
        System.out.println("cumle.substring(2,8) = " + cumle.substring(2, 8));  //ilki dahil ikincisi hariç
        System.out.println("cumle.substring(2) = " + cumle.substring(2));

        String str = "Malatya";
        String str2= str.substring(3,5);
        System.out.println("str2 = " + str2);

        System.out.println("str2.substring(5) = " + str.substring(5));

        System.out.println("str.substring(5,6) = " + str.substring(5, 6));
        System.out.println("str.length() = " + str.length());

        System.out.println("str.substring(6) = " + str.substring(6));

        str = "Kars";

        System.out.println("str.substring(str.length()-1) = " + str.substring(str.length() - 1));

        str = "Ardahan";

        System.out.println("str.substring(str.length()-1) = " + str.substring(str.length() - 1));

        System.out.println("str.substring(0,1) = " + str.substring(0, 1));


     //   System.out.println("str.substring(5,3) = " + str.substring(5, 3));   //runtime error

       //  str.   //compile time error


    }
}
