package StateDesignPatternExample2;

public class MobileContext {
    MobileAlertState currentState;
    public MobileContext(){
        currentState= new Ringing();
    }

    public void setCurrentState(MobileAlertState mobileAlertState){
        this.currentState=mobileAlertState;
    }

    void alert(){
        currentState.alert();
    }
}
