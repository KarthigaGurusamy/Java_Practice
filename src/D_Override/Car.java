package D_Override;

public class Car extends Vehicle{

    public Car()
    {
        System.out.println("Car constructor");
    }
    void getModel(){
        System.out.println("Child - BMW");
    }
}
