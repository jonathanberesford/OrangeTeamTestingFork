import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class PersonTest {

//    @Test
//    public void testObjectCounter(){
//        Person josh = new Person("Josh", "DB", LocalDate.parse("2002-03-11"));
//        Person dave = new Person("Dave", "Smith", LocalDate.parse("1999-04-12"));
//        Person bob = new Person("Bob", "Simpson", LocalDate.parse("2000-09-16"));
//        Person alice = new Person("Alice", "Inwonderland", LocalDate.parse("1980-01-31"));
//        System.out.println(Person.createdPeople);
//        assertEquals(4, Person.createdPeople.size());
//    }

    @Test
    public void testGetfName() {
        Person testPerson = new Person("Josh","DB", LocalDate.parse("2002-03-11"));
        assertEquals("Josh",testPerson.getfName());
    }

    @Test
    public void testSetfName() {
        Person testPerson = new Person("Josh","DB", LocalDate.parse("2002-03-11"));
        testPerson.setfName("Connor");
        assertEquals("Connor",testPerson.getfName());
    }

    @Test
    public void testGetlName() {
        Person testPerson = new Person("Josh","DB", LocalDate.parse("2002-03-11"));
        assertEquals("DB",testPerson.getlName());
    }

    @Test
    public void testSetlName() {
        Person testPerson = new Person("Josh","DB", LocalDate.parse("2002-03-11"));
        testPerson.setlName("Mackintosh");
        assertEquals("Mackintosh",testPerson.getlName());
    }

    @Test
    public void testGetDOB() {
        Person testPerson = new Person("Josh","DB", LocalDate.parse("2002-03-11"));
        assertEquals(LocalDate.parse("2002-03-11"),testPerson.getDOB());
    }

    @Test
    public void testSetDOB() {
        Person testPerson = new Person("Josh","DB", LocalDate.parse("2002-03-11"));
        testPerson.setDOB(LocalDate.parse("1995-10-29"));
        assertEquals(LocalDate.parse("1995-10-29"),testPerson.getDOB());
    }

    @Test
    public void testGetAge() {
        Person testPerson = new Person("Josh","DB", LocalDate.parse("2002-03-11"));
        int expectedAge = 21;
        assertEquals(expectedAge,testPerson.getAge());
    }

    @Test
    public void testToString() {
        Person testPerson = new Person("Josh","DB", LocalDate.parse("2002-03-11"));
        String expectedString = "First Name: " + "Josh" + " | Last Name: " + "DB" + " | DOB: " + LocalDate.parse("2002-03-11") + " | Age: " + 21;
        assertEquals(expectedString, testPerson.toString());
    }


}
