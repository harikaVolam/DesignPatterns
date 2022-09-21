package ProtypeDesignPattern;

public abstract class SmartPhone implements Cloneable {
    private String model;
    private int price;
    private int additionalPrice = 0;

    public User getUser() {
        return user;
    }

    private User user;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price + this.additionalPrice;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAdditionalPrice(int additionalPrice) {
        this.additionalPrice = additionalPrice;
    }

    public void setUser(User user){
        this.user=user;
    }

    public SmartPhone clone() throws CloneNotSupportedException {
        SmartPhone sp= (SmartPhone) super.clone();
        sp.setUser(user.clone());
        return sp;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", additionalPrice=" + additionalPrice +
                ", user=" + user +
                '}';
    }

}
