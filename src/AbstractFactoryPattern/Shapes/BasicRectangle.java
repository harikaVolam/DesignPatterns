package AbstractFactoryPattern.Shapes;

public class BasicRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside BasicRectangle::draw() method.");
    }
}
