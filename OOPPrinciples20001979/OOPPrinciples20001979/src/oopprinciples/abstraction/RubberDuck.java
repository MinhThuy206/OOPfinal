package oopprinciples.abstraction;

public class RubberDuck extends Duck implements Flyable {
    @Override
    public String toString() {
        return "RubberDuck";
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
    }

    @Override
    public void fly() {
        System.out.println("Cant fly");
    }
}
