package oopprinciples.polymorphism;

public class Mallard extends Duck {
    public Mallard() {
        super("Mallard");
    }

    @Override
    public void quack() {
        super.quack();
        System.out.println("Quack");
    }
}
