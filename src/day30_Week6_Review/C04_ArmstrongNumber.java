package day30_Week6_Review;

public class C04_ArmstrongNumber {

    public static void main(String[] args) {

        //153: 3'ün küpü 27, 5'in küpü 125, 1'in küpü 1=    27+125+1= 153

        /*
        int sum=0;
        int number = 153; // 102a bölersek bölüm:10 kalan:3
        int originalNumber= number; //153
        // bölüm: /
        // kalan: %

        int lastDigit = number % 10; //remainder
        System.out.println("lastDigit = " + lastDigit);//3
        number= number/10;
        System.out.println("number = " + number); //15
        int lastDigit2= number%10;
        System.out.println("lastDigit2 = " + lastDigit2);
        number=number/10;
        System.out.println("number = " + number);
        sum = lastDigit*lastDigit*lastDigit+lastDigit2*lastDigit2*lastDigit2+number*number*number;
        System.out.println("sum = " + sum);
        System.out.println("originalNumber = " + originalNumber);

        boolean equal= sum==originalNumber;

        System.out.println("equal = " + equal);
        */

//        System.out.println(isArmstrongNumber(153));
//        System.out.println(isArmstrongNumber(100));

        for (int i = 100; i < 1000 ; i++) {
            if(isArmstrongNumber(i)) {
                System.out.println("i = " + i);
            }
        }


    }

    public static boolean isArmstrongNumber(int number){

        int sum=0;
        int originalNumber=number;

        while (number>0){

            int lastDigit = number % 10;
            number= number/10;
            sum +=(Math.pow(lastDigit,3));
        }

        if(sum==originalNumber){
            return true;
        }

        return false;
    }

}
