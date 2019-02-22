import java.util.*;

public class StudentManagement {
    private  ArrayList<Student> list = new ArrayList<>();

    public ArrayList<Student> getList() {
        return list;
    }

    public boolean hasDuplicates(Student newStudent) {
        for (Student student : list) {
            if (student.name.equals(newStudent.name)) {
                return true;
            }
        }
        return false;
    }

    // Positive test case:
    // 1.1. Add new student "Tom". addStudent(Student student)
    // 1.2 expected addStudent return true;
    //     Assert.assertArrayEquals(addStudent(student), true);

    // Negative:
    // 1.1. Add new student "Tom"
    // 1.2 Assert.assertArrayEquals(addStudent(student), true);
    // 1.1. Add new student "Tom"
    // Assert.assertArrayEquals(addStudent(student), false);


    public boolean addStudent(Student student) {
        // TODO: Check if list contains similar student.
        if (hasDuplicates(student)) {
            System.out.println("Student already exists");
            return false;
        }

        list.add(student);
        return true;
    }

    public boolean updateStudentName(String oldName, String newName) {
        for (Student student : list) {
            if (student.name.equals(oldName)) {
                student.name = newName;
                return true;
            }
        }
        return false;
    }


    public void printStudents() {
        for (Student x : list) {
            System.out.println("student name is: " + x.getName());
        }
    }

    public void deleteStudent(Student student) {
        list.remove(student);
    }
}


