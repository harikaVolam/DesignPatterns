package FactoryPattern;



/*The factory method pattern pervades toolkits and frameworks.
The pattern can be used whenever a class doesn't know ahead of time what subclass objects it would need to instantiate.
This is common problem in designing frameworks,
where the consumers of the framework are expected to extend framework provided abstract classes and hook-in functionality or object creations.
 */


//java.util.Calendar.getInstance()
//java.util.ResourceBundle.getBundle()
//java.text.NumberFormat.getInstance()
public class Main {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = ShapeFactory.getShape("CIRCLE");

       shape.draw();
    }
}
