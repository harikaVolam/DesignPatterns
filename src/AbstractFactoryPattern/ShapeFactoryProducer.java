package AbstractFactoryPattern;


import AbstractFactoryPattern.Factories.BasicShapeFactory;
import AbstractFactoryPattern.Factories.RoundedShapeFactory;
import AbstractFactoryPattern.Factories.ShapeFactory;

//Factory of factories
//Here shapeFactoryProducer produces instnace of factory which internally gives a shape corresponding
//Here factories are grouped logically based on type i.e basicFactory and RoundedFactory
public class ShapeFactoryProducer {

        public static ShapeFactory getFactory(boolean rounded){
            if(rounded){
                return new RoundedShapeFactory();
            }else{
                return new BasicShapeFactory();
            }
        }

}
