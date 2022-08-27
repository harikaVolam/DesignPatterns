package AbstractFactoryPattern.Factories;

import AbstractFactoryPattern.Shapes.Shape;
import AbstractFactoryPattern.Shapes.BasicRectangle;

public class BasicShapeFactory extends ShapeFactory {
    @Override
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new BasicRectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new BasicSquare();
        }
        return null;
    }
}
