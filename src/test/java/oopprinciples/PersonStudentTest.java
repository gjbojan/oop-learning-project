package oopprinciples;

import org.junit.Test;
import personstudent.Person;
import personstudent.Student;

import static org.junit.Assert.assertEquals;

public class PersonStudentTest {

    Person person1 = new Person("Andrej", "Andonoski", 30, "male");
    Person person2 = new Person();

    Student student1 = new Student("Ana", "Mileva", 21, "female", 23053);
    Student student2 = new Student();

    @Test
    public void personTest() {
        assertEquals("Andrej", person1.getName());
        assertEquals("Andonoski", person1.getSurname());
        assertEquals(30,person1.getAge());
        assertEquals("male", person1.getGender());

        person2.setName("Mihaela");
        person2.setSurname("Mihajlovska");
        person2.setAge(24);
        person2.setGender("female");

        assertEquals("Mihaela", person2.getName());
        assertEquals("Mihajlovska", person2.getSurname());
        assertEquals(24,person2.getAge());
        assertEquals("female", person2.getGender());
    }

    @Test
    public void studentTest() {
        assertEquals("Ana", student1.getName());
        assertEquals("Mileva", student1.getSurname());
        assertEquals(21,student1.getAge());
        assertEquals("female", student1.getGender());
        assertEquals(23053, student1.getStudentID());

        student1.numberIDOfStudent();

        student2.setName("Marko");
        student2.setSurname("Damceski");
        student2.setAge(22);
        student2.setGender("male");
        student2.setStudentID(312875);

        assertEquals("Marko", student2.getName());
        assertEquals("Damceski", student2.getSurname());
        assertEquals(22,student2.getAge());
        assertEquals("male", student2.getGender());
        assertEquals(312875, student2.getStudentID());

        student2.numberIDOfStudent();
    }
}
