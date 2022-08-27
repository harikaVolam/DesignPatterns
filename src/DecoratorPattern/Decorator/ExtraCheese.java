package DecoratorPattern.Decorator;

import DecoratorPattern.Component.BasePizza;


//Extending ToppingDecortor which is of type basePizza type so this is called is a relationship
public class ExtraCheese extends ToppingDecorator{

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    //Represent Has A Relationship with same type of class
    BasePizza basePizza;

    @Override
    public int cost() {
        return this.basePizza.cost()+10;
    }
}
