package withoutStrategyPattern;

public class SportsVehicle extends Vehicle{

    //OffRoad and Sports vehicle has same code which leads to code duplication
    public void drive(){
        System.out.println("Special Drive");
    }
}
