package day41_encapsulation_and_staticKeyword;

public class C02_AccessModifierTest {
    public static void main(String[] args) {
//        System.out.println(C01_AccessModifier.hospitalName);
//        System.out.println(C01_AccessModifier.branchName);
//        System.out.println(C01_AccessModifier.doctorName);
//
//        C01_AccessModifier accessModifier=new C01_AccessModifier();
//        System.out.println(accessModifier.hospitalName_1);
//        System.out.println(accessModifier.branchName_1);
//        System.out.println(accessModifier.doctorName_1);

        /*
        aynı package içindeki bu classtan sadece public, protected
        ve default fiedlara erişim sağlarız..
         */

        C01_AccessModifier accessModifier1 = new C01_AccessModifier();
        System.out.println(accessModifier1.hospitalName_1);
        C01_AccessModifier accessModifier2 = new C01_AccessModifier("AA Hospital");
        System.out.println(accessModifier2.hospitalName_1);
        C01_AccessModifier accessModifier3 = new C01_AccessModifier("BB Hospital","KBB");
        System.out.println(accessModifier3.branchName_1);
        System.out.println(accessModifier3.hospitalName_1);
    }
}
