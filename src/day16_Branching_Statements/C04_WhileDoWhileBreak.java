package day16_Branching_Statements;

public class C04_WhileDoWhileBreak {
    public static void main(String[] args) {

        int i = 10;

        while (i <= 20) {
            i++;
            if (i == 15) {
                continue;
            }
            System.out.println(i);

        }

        int x = 0;

        //do-while
        do {
            x++;

            if (x == 6) {
                continue;
            }
            System.out.println(x);
        } while (x < 10);

        System.out.println("---------------------");

        boolean bl= true;
        while (bl){
            for (int j = 0; j <= 5; j++) {
                System.out.println(j);
                if (j==3){
                   bl=false;
                   break;
                }
            }
        }

        System.out.println("while dışındayız");
    }
}