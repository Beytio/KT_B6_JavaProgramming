package day25_Review;

public class C08_Empty {
    public static void main(String[] args) {
        emptyControl("");
    }

    // kullanıcıdan parametre ile string alalım
    // girilen string boş ise "String is empty." yazsın
    // eğer üç harften uzun ise ilk 3 harfini değil ise tamamını yazsın

    public static void emptyControl(String word){
        if (word.isEmpty()){
            System.out.println("String is empty.");
        }else if (word.length()>3){
            System.out.println(word.substring(0,3));  //0  1  2
        }else {
            System.out.println(word);
        }
    }
}
