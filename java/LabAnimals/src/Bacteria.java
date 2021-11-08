public class Bacteria extends Animal {

    public void move() {
        System.out.println("The  " + getClass().getName() + " is moving");
    }
    public void feed() {
        System.out.println("The  " + getClass().getName() + " is feeding");
    }

    public void rest() {
        System.out.println("The  " + getClass().getName() + " is resting");
    }
}
