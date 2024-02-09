package day35_Week07_Review;

public class C11_ReverseWordInSennt {
    public static void main(String[] args) {
        String str="I loved you";

        String s[]=str.split(" ");

        String reverseLove="";
        for (int i = s[1].length()-1; i >= 0; i--) {
            reverseLove+=s[1].charAt(i);
        }


        String newSentence=str.replace(s[1],reverseLove);
        System.out.println(newSentence);
    }
}
