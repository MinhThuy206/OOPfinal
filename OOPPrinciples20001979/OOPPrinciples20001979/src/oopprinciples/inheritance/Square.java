package oopprinciples.inheritance;

public class Square extends Rectangle {
    public Square(float width) {
        super(width, width);
    }

    @Override
    public String toString() {
        return "Square{" +
            "width=" + width +
            '}';

    }
}
