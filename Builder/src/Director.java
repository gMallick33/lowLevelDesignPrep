public class Director {
    StudentBuilder studentBuilder;

    Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if(studentBuilder instanceof EngineeringStudentBuilder) {
            return createEngineeringStudent();
        }
        return null;
    }

    public Student createEngineeringStudent() {
        return studentBuilder.setRollNo("1").setAge(2).setName("gyani").setSubjects().build();
    }
}
