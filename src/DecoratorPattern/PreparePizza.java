package DecoratorPattern;

import DecoratorPattern.Component.BasePizza;
import DecoratorPattern.Component.Margherita;
import DecoratorPattern.Decorator.ExtraCheese;
import DecoratorPattern.Decorator.Mushroom;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PreparePizza {

    public static void main(String[] args) throws IOException {
        BasePizza pizza = new Mushroom(new ExtraCheese(new Margherita()));
        System.out.println(pizza.cost());

        // FileInputStream is responsible for reading the file
        FileInputStream fileInputStream = new FileInputStream("myFile.txt");
        // BufferedInputStream extends FilterInputStream and not FileInputStream, it is
        // a decorator which enhances the functionality of the original object by wrapping over it.
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        // The read operation becomes buffered now
        bufferedInputStream.read();

        /*

        The FileInputStream is the object actually responsible for reading the text file.
        If we wanted to introduce buffered read functionality,
            one way of doing it would be to subclass FileInputStream and add the new functionality.
        The other is to use the decorator pattern which is how it is implemented in the Java framework.
        The BufferedInputStream wraps the FileInputStream to provide buffering capabilities.
         */



    }


}
