package ProtypeDesignPattern;


public class Samsung extends SmartPhone {

    public Samsung(String model,User user) {
        this.setPrice(1000);
        this.setModel(model);
        this.setUser(user);
    }

    @Override
    public SmartPhone clone() throws CloneNotSupportedException {
        return (Samsung) super.clone();
    }
}