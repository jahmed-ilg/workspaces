public class Bus extends Vehicle {


    void accelera(){
        System.out.println("El Bus se esta accelerando ");
    }

    void frena(){
        System.out.println("El Bus se esta frenanado ");
    }

    void arranca(){
        System.out.println("El Bus esta arrancando ");
    }

    @Override
    public void expulsaCO2(){
        System.out.println(getClass().getName()+" Expulsa 68 grams de C02 por passagero");
    }

    @Override
    public void carburant(){
        System.out.println(getClass().getName()+" Mi carburante es Diesel ");
    }
    public static void main(String[] args) {

    }
}
