package oopprinciples.encapsulation;

public class TestDriver {
    public static void main(String[] args) {
        Student student = new Student("Do Thi Bich Thuy","20001979");
        System.out.println(student);
        System.out.println(student.getName());
        student.setMsv("K65-20001979");
        System.out.println(student);
//        Dữ liệu không được truy cập trực tiếp mà phải truy cập qua các hàm getter setter
    }
}
