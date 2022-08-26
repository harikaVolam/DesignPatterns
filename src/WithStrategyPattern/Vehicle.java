package WithStrategyPattern;

public class Vehicle {

    WithStrategyPattern.DriveStrategy driveStrategy;

    //Here we need to observe that we are injecting interface reference type not the concrete classes reference type.
    //Respective vehicles will send the desired drive strategy with instance of any concrete class of driveStrategy
    Vehicle(WithStrategyPattern.DriveStrategy driveStrategy){
        this.driveStrategy=driveStrategy;
    }

    void drive(){
        driveStrategy.drive();
    }
}
