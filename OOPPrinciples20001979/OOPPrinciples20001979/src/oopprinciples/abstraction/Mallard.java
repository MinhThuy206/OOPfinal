package oopprinciples.abstraction;

public class Mallard extends Duck implements Flyable {
    @Override
    public String toString() {
        return "Mallard";
    }

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("Flap");
    }

}
