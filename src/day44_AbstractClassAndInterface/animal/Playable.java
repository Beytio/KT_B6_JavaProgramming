package day44_AbstractClassAndInterface.animal;

public interface Playable {
    boolean isFriendly = true; // static & final

    public static void method1(){
        System.out.println("isFriendly = " + isFriendly);
    }  // staric olmak zorunda

    void play();//abxtract method by default  // must be overwritten

}
