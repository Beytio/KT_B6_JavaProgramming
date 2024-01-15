package day16_Branching_Statements;

public class C10_NestedLoopBranching {
    public static void main(String[] args) {

        outer:
        for (int i = 0; i <5 ; i++) {
            System.out.print(i);
            inner:
            for (int j=0; j<=3; j++){
                if (j==2){
                   continue outer;
                }
                System.out.print("A");
            }
            System.out.println();
        }
    }
}
