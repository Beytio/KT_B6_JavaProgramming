package day34_Arrays_04;

import java.util.Arrays;

public class C05_TwoDimensionalArray {
    public static void main(String[] args) {
        String names [] = {"Ahmet","Erdi","Halis","Eda","Şule","Makbule","Serap"};

        String [][] students = new String[2][3];
        students[0][0] = "Muhammed";
        students[0][1] = "Burcu";
        students[0][2] = "Seda";
        //students[0][3] = "Serap";  // Index 3 out of bounds for length 3
        System.out.println(Arrays.deepToString(students));

        students[1][0] = "Ece";
        students[1][1] = "Veli";
        students[1][2] = "Sedat";

        System.out.println("students.length = " + students.length);  //satır sayısı yani içinde kaç array var
        System.out.println("students[0].length = " + students[0].length);  // ilk indexteki arrayin boyunu verir


        System.out.println(Arrays.deepToString(students));

        // {{"Ahmet","Erdi","Halis"},{"Eda","Şule","Makbule"}};

        for(String student[] : students){
            for (String ogrenci : student){
                System.out.print(ogrenci+" ");
            }
            System.out.println();
        }

        System.out.println("------------------------");

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                System.out.print(students[i][j]+" ");
            }
            System.out.println();
        }
    }
}
//  "Ahmet" "Ali"
//  "Mehmet" "Musa"
//  "Sema" "Jale"