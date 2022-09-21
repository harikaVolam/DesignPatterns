package ProtypeDesignPattern;

public class Apple extends SmartPhone {
    public Apple(String model,User user) {
        this.setPrice(1200);
        this.setUser(user);
        this.setModel(model);
    }

    @Override
    public SmartPhone clone() throws CloneNotSupportedException {
        return (Apple) super.clone();
    }
}
