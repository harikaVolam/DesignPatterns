package NullObjectPattern;

public class VehicleFactory {

    public static Vehicle getVehicle(String typeOfVehicle){
        if("CAR".equals(typeOfVehicle)){
            return new Car();
        }
        return new NullVehicle();
    }
}
