package D_Override;

public class D_Override {

    public static void main(String[] args) {

        Vehicle vehicle = new Car();

        Vehicle vehicle1 = new Vehicle(10);


        Car car = (Car) vehicle;

        //Upcasting
        vehicle.getModel();
        vehicle.getWheels();

        //Downcasting
        car.getModel();
        car.getWheels();

        vehicle1.getModel();

        //unboxing - wrapper class to primitive data types
        Integer numA = 5;
        int a = numA;
        System.out.println(a);

        //Casting - convert the data types
        float numFloat = 1.4f;
        int intA = (int) numFloat;
        System.out.println(intA);
    }
}
