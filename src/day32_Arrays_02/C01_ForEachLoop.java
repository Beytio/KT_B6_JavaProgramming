package day32_Arrays_02;

public class C01_ForEachLoop {
    public static void main(String[] args) {
        String [] arr=new String[4];
        arr[0]="Mehmet";
        arr[1]="Ahmet";
        arr[2]="Nisa";
        arr[3]="Tugba";

        System.out.println("arr[0] = " + arr[0]);
        System.out.println("arr[3] = " + arr[3]);

        System.out.println("arr[1] = " + arr[1]);

        System.out.println("arr.length = " + arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr["+i+"] = " + arr[i]);
        }

        System.out.println("------------------------");

        for (String str:arr) {
            System.out.println("str = " + str);
        }


    }
}
