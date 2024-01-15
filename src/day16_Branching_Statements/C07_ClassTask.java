package day16_Branching_Statements;

public class C07_ClassTask {
    public static void main(String[] args) {
        // 1 den 100 e kadar 5 in katlarını ekrana yazdıralım
        // continue kullanarak

        for (int i = 1; i <=100 ; i++) {

            if (!(i % 5 ==0)){
                continue;
            }
            System.out.println(i);
        }
    }
}
