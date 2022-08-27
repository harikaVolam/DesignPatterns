package DecoratorPattern;

import DecoratorPattern.Component.BasePizza;
import DecoratorPattern.Component.Margherita;
import DecoratorPattern.Decorator.ExtraCheese;
import DecoratorPattern.Decorator.Mushroom;

public class PreparePizza {

    public static void main(String[] args) {
        BasePizza pizza = new Mushroom(new ExtraCheese(new Margherita()));
        System.out.println(pizza.cost());
    }
}
