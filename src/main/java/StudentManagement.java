import java.util.*;

public class StudentManagement  {

    private ArrayList<Student> list = new ArrayList<>();

    public boolean hasDuplicates(Student newStudent) {
         for(Student student: list) {
             if (student.name.equals(newStudent.name)) {
               return true;
             }
         }
         return false;
     }

    public boolean addStudent(Student student) {
        // TODO: Check if list contains similar student.
        if (hasDuplicates(student)) {
            System.out.println("Student already exists");
            return false;
        }

        list.add(student);
        return true;
    }


    public void printStudents() {
        for (Student x : list) {
            System.out.println("student name is: " + x.getName());
        }

    }
}
