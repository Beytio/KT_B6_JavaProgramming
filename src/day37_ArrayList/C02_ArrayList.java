package day37_ArrayList;

import java.util.ArrayList;

public class C02_ArrayList {
    public static void main(String[] args) {

        ArrayList <String> nameList = new ArrayList<>();
        nameList.add("Ali");
        nameList.add("Veli");
        nameList.add("Filiz");
        nameList.add("Macit");

        System.out.println("nameList = " + nameList);

        nameList.add(0,"Banu");

        System.out.println("nameList = " + nameList);

    }
}
