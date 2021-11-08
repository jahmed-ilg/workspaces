public class Tren extends Vehicle {


    void accelera(){
        System.out.println("El Tren se esta accelerando ");
    }

    void frena(){
        System.out.println("El Tren se esta frenanado ");
    }

    void arranca(){
        System.out.println("El Tren esta arrancando ");
    }

    @Override
    public void expulsaCO2(){
        System.out.println(getClass().getName()+" No Contamina");
    }

    @Override
    public void carburant(){
        System.out.println(getClass().getName()+" Mi carburante es Electricidad ");
    }
    public static void main(String[] args) {

    }
}
