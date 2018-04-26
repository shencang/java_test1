package Text5_interface;

public class Person {
    private  Bus bus;
    private  Bike bike;
    public Person(Bus bus){
        this.bus=bus;
        bus.start();
        bus.stop();


    }
    public Person(Bike bike){
        this.bike=bike;
        bike.start();
        bike.stop();
    }
}
