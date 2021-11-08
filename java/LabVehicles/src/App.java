public class App {

    public static void main(String[] args) throws Exception {
        Car car = new Car();
        car.accelera();
        car.frena();
        car.arranca();

        Moto moto = new Moto();
        moto.accelera();
        moto.frena();
        moto.arranca();

        Bus bus = new Bus();
        bus.accelera();
        bus.frena();
        bus.arranca();

        Tren tren = new Tren();
        tren.accelera();
        tren.frena();
        tren.arranca();
    
      Vehicle[] vehicles = new Vehicle[]{new Vehicle() , new Car() , new Moto() , new Bus() , new Tren()}; 
      for (Vehicle vehicle : vehicles) {
          vehicle.arranca();
          vehicle.frena();
          vehicle.accelera();
          
      }

      Polluter[] polluters= new Polluter[]{new Vehicle() , new Car() , new Moto() , new Bus() , new Tren()};
      for (Polluter polluter : polluters) {
          polluter.expulsaCO2();
          polluter.carburant();
      }
    }
}
