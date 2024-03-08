package day53_Collections2;

import java.util.Set;
import java.util.TreeSet;

public class C04_SetPractice2 {
    public static void main(String[] args) {
        String str="Korkma sönmeSz bu şafaklarda yüzen alsancak";
        System.out.println("uniqueLetterCount(str) = " + uniqueLetterCount(str));
    }


    public static int uniqueLetterCount(String str){
        String [] strArr=str.replace(" ","").split("");
        Set<String> uniqueChars=new TreeSet<>();
        for (String s : strArr) {
            uniqueChars.add(s);
        }
        System.out.println("uniqueChars = " + uniqueChars);
        return  uniqueChars.size();

    }
}
