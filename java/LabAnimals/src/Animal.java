interface Speakable {
    abstract void makeSound();
    default void organ(){
        System.out.println("Parlo per la boca");
    }
}

public class Animal {


    public void move() {
        System.out.println("The Animal is moving");
    }

    public void jump() {
        System.out.println("The Animal is jumping");
    }

    public void rest() {
        System.out.println("The Animal is resting");
    }

    public static void main(String[] args) {

    }
}
