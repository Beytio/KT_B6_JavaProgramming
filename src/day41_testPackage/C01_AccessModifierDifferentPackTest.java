package day41_testPackage;

import day41_encapsulation_and_staticKeyword.C01_AccessModifier;

public class C01_AccessModifierDifferentPackTest extends C01_AccessModifier{
    public static void main(String[] args) {
        System.out.println(C01_AccessModifier.hospitalName);

        C01_AccessModifier accessModifier = new C01_AccessModifier();
        System.out.println(accessModifier.hospitalName_1);



        C01_AccessModifierDifferentPackTest aMDPT = new C01_AccessModifierDifferentPackTest();

        System.out.println(aMDPT.branchName_1);


    }
}
