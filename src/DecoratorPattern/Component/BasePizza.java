package DecoratorPattern.Component;


//Components doesnot have has-a relationship
//Decorator has a has-a and is-a relationship,
//Decorator pattern solves the problem of class explosion
public abstract class BasePizza {
    public abstract int cost();
}
