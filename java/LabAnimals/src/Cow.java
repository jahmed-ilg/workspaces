public class Cow extends Animal implements Speakable{
    public void move() {
        System.out.println("The  " + getClass().getName() + " is moving");
    }

    public void jump() {
        System.out.println("The  " + getClass().getName() + " is jumping");
    }

    public void rest() {
        System.out.println("The  " + getClass().getName() + " is resting");
    }

    
    public void makeSound(){
        System.out.println("The  " + getClass().getName() + " says Moo");
    }
}
