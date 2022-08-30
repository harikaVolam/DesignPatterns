package NullObjectPattern;


//A null object replaces null return type
//No need to put if check for checking null
//null object reflects do nothing or default behaviour

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicle("some random");
        System.out.println(vehicle.getSeatingCapacity());
        System.out.println(vehicle.getTankCapacity());
    }

}
