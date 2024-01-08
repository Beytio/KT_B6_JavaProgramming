package day10_Relational_LogicalOperators_Review;

public class C06_LogicalOperators {

    public static void main(String[] args) {

        String name="Tugba";
        int age=17;
        String citizenship="Turkish";

        //18+ , Turkish
        //


        boolean isEligibleForVote = age>=18  && citizenship.equals("Turkish");
                //citizenship=="Turkish";   --- stringlerde eşitlik == ile kontrol edilmez!!!!!!

        System.out.println("isEligibleForVote = " + isEligibleForVote);
        System.out.println(name+" is elegible for vote : "+isEligibleForVote);

        System.out.println("-------------");


        String name2="Yusuf";
        int findexScore=800;
        int age2=29;
        int income=40000;

        // findexscore >1100
        // income >=25000
        // age>=18   age<70

        boolean isEligibleForLoan= age>=18  && age<70  && findexScore>1100 && income>=25000;

        System.out.println(name2 +" is eligible for loan from BankOfJava : "+ isEligibleForLoan);


        System.out.println("-------------------------------");

        String name3="Jack";
        int age3=20;
        char gender='M'; //Male    Female

        boolean isEligibleToBuyAlcohol= age3>=21 &&  ( gender=='M'  || gender=='F');

        System.out.println(name3 +" is eligible to buy Alcohol : "+isEligibleToBuyAlcohol);


        System.out.println("------------------------");


        String studentName="AHmet";
        double gpa= 3.2;
        int familyIncome=25000;

        boolean isEligibleForScholarShip= gpa>=3.5  || familyIncome<=20000;
        System.out.println(studentName+" is eligible for scholarship : "+isEligibleForScholarShip);

        System.out.println("--------");

        boolean result1=true;
        System.out.println("result1 = " + result1);
        System.out.println("!result1 = " + !result1);


        System.out.println("--------------------");


        int examScore=75;

        boolean isPassed= examScore>=60;
        boolean isFailed= !isPassed;

        System.out.println("isPassed = " + isPassed);
        System.out.println("isFailed = " + isFailed);

        boolean isAsker= true;
        int yas =25;
        boolean isLise=true;

        boolean bl= isAsker && (yas<26) && isLise;
        System.out.println("bl = " + bl);


    }
}


/*
OR Operator
        Conditions        True   ||    True    ------  TRUE
                          True   ||    False   ------  TRUE
                          False  ||    True  -  -----  TRUE
                          False  ||    False   ------   FALSE


 AND Operator
        Conditions        True   &&    True    ------  TRUE
                          True   &&    False   ------  FALSE
                          False  &&    True  -  -----  FALSE
                          False  &&    False   ------  FALSE


 */