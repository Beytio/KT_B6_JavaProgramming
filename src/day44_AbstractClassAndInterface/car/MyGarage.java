package day44_AbstractClassAndInterface.car;

public class MyGarage {
    public static void main(String[] args) {
        Honda honda = new Honda("Accord", "Black", 2010, 57000);
        honda.start();
        honda.stop();

        Audi audi = new Audi("RS6", "Red", 2023, 1200000);
        System.out.println(audi);
        audi.start();
        audi.stop();
        audi.quatro();
        audi.autoPark();


        Togg togg = new Togg();
        System.out.println(togg);
        togg.setColor("Toros Siyahi");
        togg.setPrice(-150000);
        System.out.println(togg);

        togg.zoom();
    }
}
