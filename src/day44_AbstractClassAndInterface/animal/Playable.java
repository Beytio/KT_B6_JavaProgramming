package day44_AbstractClassAndInterface.animal;

public interface Playable {
    boolean isFriendly=true;
    void play();
    static void method1(){
        System.out.println("is Friendly "+ isFriendly);
    }
}
