package day11_ControlFlowStatement_IF;

public class C02_If_Examples {
    public static void main(String[] args) {

        int yas=35;

        if (yas>60){   // if'in yanındaki condition yani şart gerçekleşirse {} içindeki kod çalışır. yoksa çalışmaz.
            System.out.println("Emekli olabilirsiniz");
        }

        System.out.println("----------------------");

        int kenarSayisi=4;

        boolean isDikdortgen =  (kenarSayisi==4);  // false

        System.out.println("kenarSayisi = " + kenarSayisi);

        if (isDikdortgen){
            System.out.println("bu bir dikdörtgendir");
        }
    }
}
