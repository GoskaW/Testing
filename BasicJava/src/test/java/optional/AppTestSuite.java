package optional;

import com.optional.App;
import com.optional.Student;
import com.optional.Teacher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTestSuite {
    @Test
    public void testGetTeacherName() {
        Teacher teacher = new Teacher("Michał Żytkowski");
        Student student2 = new Student("Janina Bąk", teacher);

        App.getTeacherName(student2);
        assertEquals(teacher, App.getTeacherName(student2));
    }

    @Test
    public void testNoTeacher () {
        Student student = new Student ("Janina bąk", null);
        App.getTeacherName(student);
        assertEquals("<undefined>", App.getTeacherName(student));
    }
}
