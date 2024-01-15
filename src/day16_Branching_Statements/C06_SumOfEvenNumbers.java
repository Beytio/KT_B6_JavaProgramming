package day16_Branching_Statements;

public class C06_SumOfEvenNumbers {
    public static void main(String[] args) {
        // 0 ve 20 dahil olmak üzere çift sayıların toplamını yazdırın

        int toplam = 0;

        for (int i = 0; i <= 20; i += 2) {
            toplam += i;
        }

        System.out.println("toplam = " + toplam);

        int sum = 0;

        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 1) {
                continue;
            }
            sum += i;
        }

        System.out.println("sum = " + sum);

        int sonuc=0;

        for (int i = 0; i <=20 ; i++) {
            if (i % 2 == 0){
                sonuc+=i;
            }
        }

        System.out.println("sonuc = " + sonuc);


        int start=0;
        int result=0;


        do {
            start++;
            if (start % 2 == 1){
                continue;
            }
            result+=start;
        }while (start<=20);

        System.out.println("result = " + result);
    }
}
