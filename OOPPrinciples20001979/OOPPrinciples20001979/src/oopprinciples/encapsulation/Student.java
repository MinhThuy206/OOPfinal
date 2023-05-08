package oopprinciples.encapsulation;

public class Student {
    private String name;
    private String msv;

    public Student(String name, String msv) {
        this.name = name;
        this.msv = msv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    @Override
    public String toString() {
        return "Student{" +
            "name='" + name + '\'' +
            ", msv='" + msv + '\'' +
            '}';
    }
}
