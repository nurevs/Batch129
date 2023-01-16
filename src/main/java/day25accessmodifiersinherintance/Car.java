package day25accessmodifiersinherintance;

public class Car extends Vehicle{

    public Car() {
        super(30000);
        System.out.println("Car 1");
    }

    public Car(String make){
        this();
        System.out.println("Car 2: "+make);
    }

}
