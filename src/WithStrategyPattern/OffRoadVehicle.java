package WithStrategyPattern;

public class OffRoadVehicle extends Vehicle{

    OffRoadVehicle() {
        super(new WithStrategyPattern.SportsDriveStrategy());
    }
}
