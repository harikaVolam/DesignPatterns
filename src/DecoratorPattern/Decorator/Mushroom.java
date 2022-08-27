package DecoratorPattern.Decorator;

import DecoratorPattern.Component.BasePizza;

public class Mushroom extends ToppingDecorator{

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    BasePizza basePizza;

    @Override
    public int cost() {
        return this.basePizza.cost()+15;
    }
}
