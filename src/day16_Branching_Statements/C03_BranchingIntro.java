package day16_Branching_Statements;

public class C03_BranchingIntro {

    public static void main(String[] args) {
        // break içinde bulunduğu loop (döngüyü) bitirir...
        for (int i = 0; i < 10; i++) {

            if (i==5){
                break;
            }
            System.out.println(i);
        }

        for (int i = 1; i <= 10; i++) {
            System.out.print("A");
            for (int j = 1; j <= 5; j++) {
                System.out.print("B");
                if (j==2){
                    break;
                }
            }
            System.out.println();
            if (i==5){
                break;
            }

        }

        System.out.println("loop dışındayız");
    }
}
