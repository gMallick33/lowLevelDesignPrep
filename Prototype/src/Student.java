public class Student implements Prototype{
    int rollNo;
    String name;
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    @Override
    public Prototype clone() {
        return new Student(rollNo, name);
    }
}
