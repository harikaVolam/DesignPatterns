package StateDesignPatternExample2;

public class Ringing implements MobileAlertState{
    @Override
    public void alert() {
        System.out.println("Mobile is ringing");
    }
}
