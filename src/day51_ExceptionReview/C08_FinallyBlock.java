package day51_ExceptionReview;

public class C08_FinallyBlock {
    public static void main(String[] args) {

        System.out.println("Test Başladı");

        String[] names = {"Ali", "Hamza", "Suat"};

        try {
            System.out.println(names[10]);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finally Test Bitti");
        }
        System.out.println("hello");

    }
}
