package day29_StringPracticeCont;

public class C01_Umbrella {

    public static void main(String[] args) {
        /*
Write a program to check if the letter 'e' is present in the word 'Umbrella'.
 */
            String str= "Umbrella";
            boolean isPresent= false;

        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i)=='e'){
                isPresent=true;
                break;
            }

        }
        System.out.println(isPresent);


    }
}
