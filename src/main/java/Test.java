public class Test {

    public static void main(String[] args) {
        StudentManagement test = new StudentManagement();
        Student student0 = new Student("dan");
        Student student1 = new Student("elvira");
        Student student2 = new Student("elvira");
        Student student3 = new Student("mickey");


        test.addStudent(student0);
        test.addStudent(student1);
        test.addStudent(student2);
        test.addStudent(student3);
        test.printStudents();
        test.getList();

    }
}
