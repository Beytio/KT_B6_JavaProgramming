package day37_ArrayList;

import java.util.ArrayList;

public class C02_ArrayList {
    public static void main(String[] args) {

        ArrayList <String> nameList = new ArrayList<>();
        //add() liste eleman eklemeye yarar..index belirtilmezse sona ekler
        //index belirtilirse, belirtilen indexe ekler
        nameList.add("Ali");
        nameList.add("Veli");
        nameList.add("Filiz");
        nameList.add("Macit");

        System.out.println("nameList = " + nameList);

        nameList.add(0,"Banu");
        nameList.add(3,"Banu");
        nameList.add("Banu");
        nameList.add("Nurbanu");

        System.out.println("nameList = " + nameList);

        //size()   listin eleman sayısı verir.
        System.out.println("nameList.size() = " + nameList.size());

        //get(index)  indexteki elemanın değerini verir.
        System.out.println("nameList.get(0) = " + nameList.get(0));
        //son elemanı geitirmek için..
        System.out.println("nameList.get(nameList.size()-1) = " + nameList.get(nameList.size() - 1));

        //set(index, data)  -- var olan değeri değiştirmek için
        System.out.println("nameList.set(0,\"Meltem\") = " + nameList.set(0, "Meltem"));
        System.out.println("nameList = " + nameList);

        // son elemanın değerini değiştirmek için
        System.out.println("nameList.set(nameList.size()-1,\"Ferhat\") = " + nameList.set(nameList.size() - 1,"Ferhat"));

        //remove (index)  -- belirtilen inexteki elemanı siler
        System.out.println("nameList.remove(0) = " + nameList.remove(0));
        System.out.println("nameList = " + nameList);

        //remove(data)   --  belirtilen datayı siler
        System.out.println("nameList.remove(\"Banu\") = " + nameList.remove("Banu"));
        System.out.println("nameList = " + nameList);

        nameList.add("Banu");
        nameList.add("Banu");
        nameList.add("Murat");

        System.out.println("nameList = " + nameList);
        
        //removeAll()
       // nameList.removeAll(nameList);  kendisini verirsek hepsini siler
        ArrayList <String> subNames = new ArrayList<>();
        subNames.add("Banu");
        subNames.add("Zehra");
        subNames.add("Murat");

        System.out.println("nameList.removeAll(subNames) = " + nameList.removeAll(subNames));

        System.out.println("nameList = " + nameList);

        //clear()  listenin bütün elemanlarını siler
      //  nameList.clear();
        System.out.println("nameList = " + nameList);

        //indexOf(data) elemanın bulunduğu ilk indexi döner
        System.out.println("nameList.indexOf(\"Filiz\") = " + nameList.indexOf("Filiz"));

        nameList.add("Banu");
        nameList.add("Banu");
        nameList.add("Murat");
        nameList.add("Banu");
        nameList.add("Banu");
        nameList.add("Murat");

        //lastIndexOf()  elemanın bulunduğu son indexi döner
        System.out.println("nameList = " + nameList);
        System.out.println("nameList.lastIndexOf(\"Banu\") = " + nameList.lastIndexOf("Banu"));

        //contains(data)  liste girilen elemanı içeriyorsa true içermiyorsa false döner
        System.out.println("nameList.contains(\"Murat\") = " + nameList.contains("Murat"));
        System.out.println("nameList.contains(\"İhsan\") = " + nameList.contains("İhsan"));

        //equals() ili arrayin eşitliğine bakar... elemanları ve indexleri aynı olamlıdır.

        ArrayList <String> nameList_1 = new ArrayList<>();

        nameList_1.add("Ali");
        nameList_1.add("Veli");
        nameList_1.add("Filiz");
        nameList_1.add("Macit");


        ArrayList <String> nameList_2 = new ArrayList<>();

        nameList_2.add("Veli");
        nameList_2.add("Ali");
        nameList_2.add("Filiz");
        nameList_2.add("Macit");

        System.out.println("nameList_1.equals(nameList_2) = " + nameList_1.equals(nameList_2));

        //isEmpty() liste boşsa true değilse false döner
        System.out.println("nameList.isEmpty() = " + nameList.isEmpty());

        System.out.println("nameList = " + nameList);
        System.out.println("nameList.size() = " + nameList.size());

        nameList.set(0,"");
        nameList.set(1,null);
        System.out.println("nameList = " + nameList);
        System.out.println("nameList.size() = " + nameList.size());


    }
}
