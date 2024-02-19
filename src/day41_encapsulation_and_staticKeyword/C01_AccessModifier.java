package day41_encapsulation_and_staticKeyword;

public class C01_AccessModifier {
    public static String hospitalName;
    public  String hospitalName_1;
    protected static String branchName;
    protected String branchName_1;
    static String doctorName;
     String doctorName_1;
    private static String patientName;
    private String patientName_1;

    public C01_AccessModifier() {
        System.out.println("Obje oluşturuldu");
    }

    public C01_AccessModifier(String hospitalName_1) {
        this();
        this.hospitalName_1 = hospitalName_1;
    }

    public C01_AccessModifier(String hospitalName_1, String branchName_1) {
        this(hospitalName_1);
        this.branchName_1 = branchName_1;
    }

    public static void exampleMethod(){
        hospitalName = "AA Hospital";
       // hospitalName_1   // static değil
        System.out.println(branchName);
        System.out.println(doctorName);
        System.out.println(patientName);
    }
    public void exampleMethod_1(){
        hospitalName = "BB Hospital";
        hospitalName_1 = "CC Hospital";
        System.out.println(branchName);
        System.out.println(branchName_1);
    }

}
