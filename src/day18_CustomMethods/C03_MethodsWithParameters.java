package day18_CustomMethods;

public class C03_MethodsWithParameters {
    public static void main(String[] args) {

        int i=54;

        oddOrEven(i);
        System.out.println("--------------------");
        ageOfPerson(1998);
        System.out.println("-------------------------");
        printNumbers(12,15);


    }


    /**
     * this function checks whether a number is odd number or even number
     *
     * @param number
     */
    public static void oddOrEven(int number){
        if (number%2==0){
            System.out.println(number+" is an cift number");
        }else{
            System.out.println(number+" is an tek number");
        }
    }


    /**
     * this method displays the age of person from the birthYear
     * @param birthYear
     */
    public static void ageOfPerson(int birthYear){
        int age=2024-birthYear;
        System.out.println("Your age = " + age);
    }


    /**
     * this method prints all the numbers between minNumber and maxNumber
     */
    public static void printNumbers(double minNumber, double maxNumber){
        for (double i = minNumber+1; i < maxNumber; i++) {
            System.out.println("i  ="+i);
        }
    }






}
