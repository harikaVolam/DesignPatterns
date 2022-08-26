package WithStrategyPattern;

public class SportsVehicle extends Vehicle{
    SportsVehicle() {
        super(new WithStrategyPattern.SportsDriveStrategy());
    }
}
