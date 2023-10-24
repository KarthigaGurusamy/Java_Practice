package E_Interface;

public interface IVehicle extends IAutomobile{


    void start();

    default void end(){}
}
