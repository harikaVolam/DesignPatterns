package StateDesignPatternExample2;

public class Mobile {
    public static void main(String[] args) {

        MobileContext mobileContext = new MobileContext();
        mobileContext.alert();

        mobileContext.setCurrentState(new Silent());
        mobileContext.alert();

        mobileContext.setCurrentState(new Ringing());
        mobileContext.alert();
    }
}
