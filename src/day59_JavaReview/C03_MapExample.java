package day59_JavaReview;

import java.util.*;

public class C03_MapExample {
    public static void main(String[] args) {
        Map<String, Object> tugbaKartvizit=new HashMap<>();

        ArrayList<String> dersTugba=new ArrayList<>();
        dersTugba.add("Matematik");
        dersTugba.add("Türkce");
        dersTugba.add("Fizik");


        tugbaKartvizit.put("isim","Tugba Aydın");
        tugbaKartvizit.put("email", "tugba@gmail.com");
        tugbaKartvizit.put("adres", "Anvers/ Belçika");
        tugbaKartvizit.put("telefon","+0032 759 60 60");
        tugbaKartvizit.put("dersler",dersTugba);




        System.out.println("tugbaKartvizit.get(\"isim\") = " + tugbaKartvizit.get("isim"));
        System.out.println("tugbaKartvizit.get(\"telefon\") = " + tugbaKartvizit.get("telefon"));






        Map<String, Object > nisaKartvizit=new HashMap<>();

        ArrayList<String> dersNisa=new ArrayList<>();
        dersNisa.add("Tarih");
        dersNisa.add("Türkce");
        dersNisa.add("Kimya");



        nisaKartvizit.put("isim","Nisa Kılıç");
        nisaKartvizit.put("email", "nisa@gmail.com");
        nisaKartvizit.put("adres", "GOP/ İstanbul");
        nisaKartvizit.put("telefon","+90 555 345 56 56");
        nisaKartvizit.put("dersler",dersNisa);



        System.out.println("nisaKartvizit.get(\"adres\") = " + nisaKartvizit.get("adres"));
        System.out.println("nisaKartvizit.get(\"email\") = " + nisaKartvizit.get("email"));


        System.out.println("-----------------");

        Map<String, Map<String,Object> > kartvizitler=new HashMap<>();
        kartvizitler.put("Tugba",tugbaKartvizit);
        kartvizitler.put("Nisa",nisaKartvizit);

        System.out.println("kartvizitler.get(\"Tugba\") = " + kartvizitler.get("Tugba"));

        kartvizitler      .get("Nisa").get("email");
        //nisaKartvizit   .get("email");  yukardaki ile aynı şeyi ifade eder

        System.out.println(kartvizitler.get("Nisa").get("email"));

        System.out.println(kartvizitler.get("Tugba"));

        System.out.println(kartvizitler.get("Tugba").get("adres"));

        System.out.println(kartvizitler);

        System.out.println(kartvizitler.get("Tugba").get("dersler").toString());

        Object o=kartvizitler.get("Tugba").get("dersler");

        String[] arrayList=(String[])o;
        for (String s : arrayList) {
            
        }
        
            
        
     //   ArrayList<String> arr=new ArrayList<>(o);


    }
}
