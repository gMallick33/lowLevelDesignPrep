public class Main {
    public static void main(String[] args) {
        Director director = new Director(new EngineeringStudentBuilder());
        Student student = director.createStudent();
        System.out.println(student.age);
        System.out.println(student.name);
    }
}