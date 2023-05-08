package oopprinciples.polymorphism;

public class TestDriver {
    public static void main(String[] args) {
        Duck[] ducks = new Duck[3];
        ducks[0] = new Duck("Duck");
        ducks[1] = new RubberDuck();
        ducks[2] = new Mallard();
        for (Duck duck : ducks) {
            duck.quack();
        }
    }
//    Cùng một hàm quack kế thừa từ class Duck nhưng mỗi class con thể hiện 1 cách khác nhau
}
