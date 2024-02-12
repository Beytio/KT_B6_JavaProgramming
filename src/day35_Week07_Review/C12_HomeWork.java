package day35_Week07_Review;

import java.util.Arrays;

public class C12_HomeWork {
    public static void main(String[] args) {
        String[] group1 = {"Ali", "Veli","Murat","Fethi"};
        String[] group2 = {"Sevtap","Aliş", "Veliye"};

        String [] mergedGroup = new String[group1.length + group2.length];

        // merge two array
        int index = 0;

        for(String gr1 : group1){
            mergedGroup[index] = gr1;
            index++;
        }

        for (String gr2 : group2){
            mergedGroup[index] =gr2;
            index++;
        }

        System.out.println("Arrays.toString(mergedGroup) = " + Arrays.toString(mergedGroup));


        String[] names1 = {"Ali", "Veli","Tercan","Murat","Fethi"};
        String[] names2 = {"Sevtap","Aliş", "Veliye","Bülent"};

        String [] allNames = new String[names1.length + names2.length];

        for (int i = 0; i < allNames.length; i++) {
            if (i< names1.length){
                allNames[i] = names1[i];
            } else{
                allNames[i] = names2[i- names1.length];
            }
        }

        System.out.println("Arrays.toString(allNames) = " + Arrays.toString(allNames));
    }
}
