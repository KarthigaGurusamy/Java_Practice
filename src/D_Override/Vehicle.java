package D_Override;

public class Vehicle {

    public Vehicle()
    {
        System.out.println("Vehicle constructor");
    }
    public Vehicle(int x)
    {
        System.out.println("Vehicle constructor with parameter:"+x);
    }
    void getModel()
    {
        System.out.println("Parent - BMW");
    }

    void getWheels()
    {
        System.out.println("Parent - 4");
    }
}
