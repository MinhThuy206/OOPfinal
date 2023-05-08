package oopprinciples.polymorphism;

public class RubberDuck extends Duck {
    public RubberDuck() {
        super("Rubber Duck");
    }

    @Override
    public void quack() {
        super.quack();
        System.out.println("Squeak");
    }
}
