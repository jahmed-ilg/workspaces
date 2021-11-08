public class Car extends Vehicle {

    void accelera(){
        System.out.println("El coche se esta accelerando ");
    }

    void frena(){
        System.out.println("El coche se esta frenanado ");
    }

    void arranca(){
        System.out.println("El coche esta arrancando ");
    }

    @Override
    public void expulsaCO2(){
        System.out.println(getClass().getName()+" Expulsa 102 grams de C02 por passagero");
    }

    @Override
    public void carburant(){
        System.out.println(getClass().getName()+" Mi carburante es Gasolina ");
    }

    public void setColor(String color){
        this.color = color ;

    }

    public String getColor(){
        return this.color;
    }

    
    public static void main(String[] args) {


        Car c = new Car();
        c.setColor("pink");

        System.out.println("The color is " + c.getColor());
        
    }
}