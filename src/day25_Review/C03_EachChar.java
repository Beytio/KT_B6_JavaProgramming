package day25_Review;

public class C03_EachChar {
    public static void main(String[] args) {
        eachChar("Mehmet");
    }

    //Ahmet    ---> A h m e t

    public static void eachChar(String word){
        //Ahmet
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i)+" ");
        }
    }


}
