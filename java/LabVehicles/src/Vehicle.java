interface Polluter {
    abstract void expulsaCO2();

    default void carburant() {
        System.out.println("My carburant is Gasoline");
    }
}

public class Vehicle implements Polluter {
    protected String color;
    protected double pes;
    protected int velocidad;

    void accelera(){
        System.out.println("El Vehicle se esta accelerando ");
    }

    void frena(){
        System.out.println("El Vehicle se esta frenanado ");
    }

    void arranca(){
        System.out.println("El Vehicle esta arrancando ");
    }

    @Override
    public void expulsaCO2(){
        
    }

    public static void main(String[] args) {

    }
}

