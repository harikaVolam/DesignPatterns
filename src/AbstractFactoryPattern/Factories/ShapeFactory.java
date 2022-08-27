package AbstractFactoryPattern.Factories;

import AbstractFactoryPattern.Shapes.Shape;

public abstract class ShapeFactory {
    public abstract Shape getShape(String shapeType) ;

    public static class BasicSquare implements Shape{

        @Override
        public void draw() {
            System.out.println("Inside BasicSquare::draw() method.");
        }
    }
}
