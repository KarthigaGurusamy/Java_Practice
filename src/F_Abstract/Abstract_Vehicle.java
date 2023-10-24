package F_Abstract;


abstract public class Abstract_Vehicle implements IVehicle{
    abstract void start();

    void end()
    {
        System.out.println("Ended");
    }
}
