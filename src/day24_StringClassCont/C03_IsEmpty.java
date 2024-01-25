package day24_StringClassCont;

public class C03_IsEmpty {
    public static void main(String[] args) {
        String name = "Ahmet";
        System.out.println("name.isEmpty() = " + name.isEmpty());
        System.out.println("name.isBlank() = " + name.isBlank());

        name ="";
        System.out.println("name.isEmpty() = " + name.isEmpty());
        System.out.println("name.isBlank() = " + name.isBlank());

        name = "        ";
        System.out.println("name.isEmpty() = " + name.isEmpty());
        System.out.println("name.isBlank() = " + name.isBlank());
    }
}
