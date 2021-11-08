public class Moto extends Vehicle {


    void accelera(){
        System.out.println("La Moto se esta accelerando ");
    }

    void frena(){
        System.out.println("La Moto se esta frenanado ");
    }

    void arranca(){
        System.out.println("La Moto esta arrancando ");
    }

    @Override
    public void expulsaCO2(){
        System.out.println(getClass().getName()+" Expulsa 72 grams de C02 por passagero");
    }

    @Override
    public void carburant(){
        System.out.println(getClass().getName()+" Mi carburante es Gasolina ");
    }

    public static void main(String[] args) {

    }
}
