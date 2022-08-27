package AbstractFactoryPattern.Factories;

import AbstractFactoryPattern.Shapes.RoundedRectangle;
import AbstractFactoryPattern.Shapes.RoundedSquare;
import AbstractFactoryPattern.Shapes.Shape;

public class RoundedShapeFactory extends ShapeFactory {
    @Override
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RoundedRectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new RoundedSquare();
        }
        return null;
    }
}
