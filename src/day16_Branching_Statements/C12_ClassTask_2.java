package day16_Branching_Statements;

public class C12_ClassTask_2 {
    public static void main(String[] args) {
        // 0-100 arasındaki sayıları
        // 30-50 arası hariç olmak üzere yazdıralım

        for (int i = 0; i <=100 ; i++) {
            if (i>=30 && i<=50){
               break;
            }
            System.out.print(i+" ");
        }
    }
}
// break içinde bulunduğumuz döngünün sonuna götürür ve döngüyü bitirir.
// continue ise içinde bulunduğumuz döngünün başına döndürür ve döngü devam eder.