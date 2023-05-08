package oopprinciples.abstraction;

public class TestDrive {
    public static void main(String[] args) {
        Duck[] ducks = {
            new RubberDuck(),
            new Mallard()
        };

        for (Duck duck : ducks) {
            System.out.println(duck);
            duck.quack();
            duck.swim();
            ((Flyable) duck).fly();
        }
    }
    // Tính trừu tượng ẩn đi các thông tin cho người dùng được thể hiện qua từ khóa abstract với class và method hoặc
    // qua interface. Một class có thể implements từ nhiều interface nhưng chỉ có thể extends từ 1 class
}
