package day42_staticAndInheritance;

public class C04_FlightCalculator extends C02_AdvancedCalculator{

    public int rota(int startPoint, int endPoint){
        System.out.println("Uçuş rotası hesaplar");
        return startPoint*endPoint-(startPoint+endPoint);

    }

    public void result(){
        System.out.println("Ben flight calculatorım.. bende sonuçlar 20 hanelidir.");
    }
}
