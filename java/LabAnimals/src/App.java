public class App {
    public static void main(String[] args) throws Exception {

        Cat c = new Cat();
        c.move();
        c.jump();
        c.rest();

        Cow cow = new Cow();
        cow.move();
        cow.jump();
        cow.rest();

        Duck duck = new Duck();
        duck.rest();

        Bacteria bacteria = new Bacteria();
        bacteria.jump();

        Animal[] animals = new Animal[]{ new Animal() , new Cat() , new Duck() , new Cow() , new Bacteria()};

        for (Animal animal : animals) {
            animal.move();
            animal.jump();
            animal.rest();
        }

        Speakable[] speakables=new Speakable[]{new Cat() , new Duck(), new Cow()};

        for (Speakable speakable2 : speakables) {
            speakable2.makeSound();
            speakable2.organ();
        }
    }
}
