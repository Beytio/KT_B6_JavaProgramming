package day35_Week07_Review;

public class C07_CommonElementsForEach {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={4,5,6,7,8};


        for (int x:arr1 ) {
            for (int a:arr2 ) {
                 if (x==a){
                     System.out.print(a+" ");
                 }
            }

        }
    }
}
