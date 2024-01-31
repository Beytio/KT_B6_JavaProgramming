package day28_StringPractice;

public class C03_Cat_Dog {
    public static void main(String[] args) {
        /*
5. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true
 */
        String str= "Ankara";
                   //012345

//        System.out.println("str.substring(1) = " + str.substring(1));
//        System.out.println("str.substring(5) = " + str.substring(5));
//        System.out.println("str.substring(1,4) = " + str.substring(1, 4));

        System.out.println("-------------------------------");

        String sentence= "caT dog dogG cAt DOg CAT";

        //System.out.println("sentence.length() = " + sentence.length());

        int countOfCat=0;

        int countOfDog=0;

        for (int i = 0; i <= sentence.length()-3; i++) {
            String newStr= sentence.substring(i,i+3);
            //System.out.println(newStr);
            if(newStr.equalsIgnoreCase("cat")){
                countOfCat +=1;
            }
            if(newStr.equalsIgnoreCase("dog")){
                countOfDog +=1;
            }
        }

//        System.out.println(countOfCat);
//        System.out.println(countOfDog);

        System.out.println(countOfDog == countOfCat);

    }
}
