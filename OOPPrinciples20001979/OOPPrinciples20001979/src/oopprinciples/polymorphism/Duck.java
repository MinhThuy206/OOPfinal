package oopprinciples.polymorphism;

public class Duck {
    protected final String name;

    public Duck(String name) {
        this.name = name;
    }
    public void quack() {
        System.out.println("The "+ name + " said:");
    }

}
