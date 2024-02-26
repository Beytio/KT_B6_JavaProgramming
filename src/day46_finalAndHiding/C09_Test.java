package day46_finalAndHiding;

public class C09_Test {
    public static void main(String[] args) {
        C08_C c = new C08_C();
        c.print();
        C08_C c1 = new C08_C();
        c1.print();

        String str = "Bodrum";
        System.out.println(str.toUpperCase());
        System.out.println(str);

        StringBuilder sb = new StringBuilder("Bodrum");
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb);

        Math.pow(2,3);
    }

}
