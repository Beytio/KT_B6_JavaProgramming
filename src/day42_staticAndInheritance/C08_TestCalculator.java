package day42_staticAndInheritance;

import day41_testPackage.C02_CalculatorDifferentPackage;
import day43_Inheritance_AccessModifiers.C01_Parent;

public class C08_TestCalculator {
    public static void main(String[] args) {

         C01_BasicCalculator basicCalculator = new C01_BasicCalculator();
        System.out.println("basicCalculator.sum(9,6) = " + basicCalculator.sum(9, 6));
        basicCalculator.result();

        C02_AdvancedCalculator advancedCalculator = new C02_AdvancedCalculator();
        System.out.println("advancedCalculator.multiply(9,3) = " + advancedCalculator.multiply(9, 3));
        System.out.println("advancedCalculator.sub(19,3) = " + advancedCalculator.sub(19, 3));
        advancedCalculator.result();

        C03_ScientificCalculator scientificCalculator = new C03_ScientificCalculator();

        System.out.println("scientificCalculator.powResult(3,3) = " + scientificCalculator.powResult(3, 3));
        System.out.println("scientificCalculator.sum(5,3) = " + scientificCalculator.sum(5, 3));
        scientificCalculator.result();

        C04_FlightCalculator flightCalculator = new C04_FlightCalculator();
        System.out.println("flightCalculator.rota(10,25) = " + flightCalculator.rota(10, 25));
        System.out.println("flightCalculator.sub(8,2) = " + flightCalculator.sub(8, 2));
        flightCalculator.result();

        System.out.println(basicCalculator.owner);
        System.out.println(advancedCalculator.owner);
        System.out.println(scientificCalculator.owner);
        System.out.println(flightCalculator.owner);


        System.out.println(basicCalculator.x);
        System.out.println(advancedCalculator.x);
        System.out.println(scientificCalculator.x);
        System.out.println(flightCalculator.x);

        C02_CalculatorDifferentPackage calculatorDifferentPackage = new C02_CalculatorDifferentPackage();
        // calculatorDifferentPackage.p default access modifier olduğundan farklı packagelardaki classlar erişim sağlayamaz.
        System.out.println(calculatorDifferentPackage.owner);

        System.out.println(flightCalculator.getName());

        // parent - child ilişkisi ne ile kurulur : extends ile kurulur
        // childClass extends parentClass şeklinde kurulur

        // Parent-Child veya Super-Sub veya Base-Derived
        // aralarındaki bağa is-a ilişkisidir. Yani kuş is a animal classtır. is a relation

        // child- parent   ---  single level inheritance
        // grandson - child - parent - grandfather (burda bağ sınırı yok) multi level inheritance
        // child1 - parent  ve child2 - parent hierarchical inheritance

        // java bir child classın iki parent classa bağlannması destekler mi? desteklemez
        // yani javada multiple inheritance mümkün değildir.

        // inheritance bağı kurulduktan sonra parent classtaki;
        // public metot ve variablelar tamamen alt classlara aktarılır.
        // protected metot ve variablelar tamamen alt classlara aktarılır.
        // default metot ve variablelar sadece aynı package içindeki child classlara tamamen aktarılır.
        // private metot ve variablelar kesinlikle child classlara aktarılmaz. (getter ile olabilir)

        // parent classtan alınan metot ya da variable child classta da varsa.. child class parenttakini
        // değil kendi variable ya da matodunu kullanır.



    }
}
