package day34_Arrays_04;

public class C06_MultiDimArray {
    public static void main(String[] args) {
        String [] group1 = {"A","B","C"};
        String [] group2 = {"Z","K","U"};
        String [] group3 = {"1","8","N"};
        String [] group4 = {"2","88","B"};
        String [] group5 = {"F","P","C"};

        String [][] groups = new String[5][];
        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;
        groups[3] = group4;
        groups[4] = group5;

        //P'yi yazdıralım
        System.out.println("groups[4][1] = " + groups[4][1]);
        //U yu yazdıralım
        System.out.println("groups[1][2] = " + groups[1][2]);
        //1'i yazdıralım
        System.out.println("groups[2][0] = " + groups[2][0]);


        // düzensiz multi dimensional arrayler

        int [][] intArray = {{1,10},{2,20,25,36},{0,36,22,1000,580}};
        System.out.println("intArray[2][2] = " + intArray[2][2]);
        System.out.println("intArray[1][3] = " + intArray[1][3]);
        System.out.println("intArray[2][4] = " + intArray[2][4]);

        intArray[2][3] = 2000;
        intArray[0][1] = 1000;

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.print(intArray[i][j]+" ");
            }
            System.out.println();
        }

        for (int [] intArr : intArray){
            for (int i : intArr){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        int [] [] [] sayilar ={{{2,2}, {3,8}, {6}, {5}},{{1,3}, {15,99}, {18,5}},{{25,5}, {23,6}, {36,88}}};

        for(int [][] ints : sayilar){
            for (int [] ints1 : ints){
                for (int i : ints1){
                    System.out.println("i = " + i);
                }
            }
        }
    }
}
