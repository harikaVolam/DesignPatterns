package FactoryPattern;

public class Main {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = ShapeFactory.getShape("CIRCLE");
       shape.draw();
    }
}
