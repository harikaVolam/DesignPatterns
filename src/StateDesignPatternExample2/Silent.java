package StateDesignPatternExample2;

public class Silent implements MobileAlertState{
    @Override
    public void alert() {
        System.out.println("Mobile is Silent");
    }
}
