package oopprinciples.inheritance;

public class Rectangle {
    protected float width;
    protected float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

public float getArea() {
        return width * height;
    }

    public float getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
            "width=" + width +
            ", height=" + height +
            '}';
    }
}
