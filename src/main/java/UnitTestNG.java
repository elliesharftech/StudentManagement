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
        Assert.assertEquals(management.addStudent(student1), false);
    }
}






