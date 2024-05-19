import java.util.List;

public class Student {
    String name;
    String rollNo;
    int age;
    String fatherName;

    List<String> subjects;

    public Student(StudentBuilder builder) {
        this.rollNo = builder.rollNo;
        this.name = builder.name;
        this.fatherName = builder.fatherName;
        this.subjects = builder.subjects;
        this.age = builder.age;
    }

}
