package generic.boundedGen;

public class Main {
    public static void main(String[] args) {
        Displayer_2<College> collegeDisplayer = new Displayer_2();

        // Student
        Student student = new Student();
        student.setName("Jack");
        student.setCollegeName("GEC");
        collegeDisplayer.setNum(student);
        collegeDisplayer.display();

        // Teacher
        Teacher teacher = new Teacher();
        teacher.setName("Rishi Sir");
        teacher.setCollegeName("GEC");
        collegeDisplayer.setNum(teacher);
        collegeDisplayer.display();

    }
}
