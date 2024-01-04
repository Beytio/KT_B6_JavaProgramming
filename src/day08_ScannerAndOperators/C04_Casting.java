package day08_ScannerAndOperators;

public class C04_Casting {
    public static void main(String[] args) {
        float bodyTemp=36.5F;

        byte num1=(byte)bodyTemp;
        short num2=(short) bodyTemp;
        int num3=(int) bodyTemp;
        float num5=bodyTemp;
        double num6=bodyTemp;


        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num5);
        System.out.println(num6);


        int i=2;
        short s=(short) i;

        System.out.println(s);
    }
}
