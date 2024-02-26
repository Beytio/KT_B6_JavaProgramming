package day46_finalAndHiding;

public  class C01_Hayvanlar {

    String ad ="Adı belirtilmemiş";
    String renk ;

     protected void hareket (){
        System.out.println("hareket ederler");
    }

    protected void solunum (){
        System.out.println("nefes alırlar");
    }

    protected void beslenme (){
        System.out.println("beslenirler");
    }

    protected void cogalma (){
        System.out.println("çoğalırlar");
    }

    protected void omur (){
        System.out.println("yaşar ve ölürler");
    }

}
