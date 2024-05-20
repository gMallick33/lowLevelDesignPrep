public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "gyani");
        Student studentClone = (Student)student.clone();
        System.out.println(studentClone.name);
    }
}