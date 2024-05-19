import java.util.List;

public abstract class StudentBuilder {
    String name;
    int age;
    String rollNo;
    String fatherName;
    List<String> subjects;

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }
    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public StudentBuilder setfatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }
    public StudentBuilder setRollNo(String rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    abstract public StudentBuilder setSubjects();

    public Student build() {
        return new Student(this);
    }
}
