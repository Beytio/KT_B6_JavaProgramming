package day16_Branching_Statements;

public class C01_Summary {

    public static void main(String[] args) {

            String name ="Ahmet";
        for(int i =1;i<100;i++) {
            if (i % 3 ==0){
                System.out.println(name+" "+i);
            }
        }

        int sayi=10;
        while (sayi>0){
            System.out.println("Hello Batch");
            sayi--;
        }



        int number = 10;
        do {
            System.out.println("Hello World");
            number--;
        }while (number>=5);


        for (int i = 0; i < 5; i++) {  //dıştaki loop satır sayısını
            System.out.print("*");
            for (int j = 0; j < 5; j++) {   //içtekş loop sütun sayısını
                System.out.print("A");
            }
            System.out.println();

        }



    }
}
