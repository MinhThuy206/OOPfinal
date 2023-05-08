package oopprinciples.inheritance;

public class TestDriver {
    public static void main(String[] args) {
        Square square = new Square(4);
        System.out.println(square);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        if (square instanceof Rectangle) {
            System.out.println("Square is a Rectangle");
        }
// Class Square kế thừa từ class Rectangle và có thể sử dụng các phương thức của class Rectangle mà không cần phải
//  viết lại các phương thức đó
    }
}
