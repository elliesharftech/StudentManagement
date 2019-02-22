import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnitTestNG {
    @Test
    public void testAddStudentPositive() {
        StudentManagement management = new StudentManagement();
        Student student1 = new Student("elvira");
        Assert.assertEquals(management.addStudent(student1), true);
    }

    @Test
    public void testAddStudentNegative() {
        StudentManagement management = new StudentManagement();
        Student student1 = new Student("elvira");
        Assert.assertEquals(management.addStudent(student1), true);
        boolean actual = management.addStudent(student1);
        boolean expected = false;
        Assert.assertEquals(actual, expected);
    }

    // expect: is what you expect to get back. Hardcoded.
    // actual: result from your method.
    @Test
    public void testUpdateStudentNamePositive() {
        StudentManagement management = new StudentManagement();
        Student student1 = new Student("elvira");
        management.addStudent(student1);
        management.updateStudentName("elvira", "ela");
        management.printStudents();
        ArrayList<Student> listOfStudents = management.getList();

        // 1. get list.
        // 2. iterate over list.
        // 3. find our name

        String actual = listOfStudents.get(0).name;
        String expected = "ela";
        Assert.assertEquals(actual, expected);

    }
}

