import java.time.LocalDate;
import java.time.Period;


public class Person {
    String fName;
    String lName;
    LocalDate DOB;
    public static int numberOfPeople=0;

    public Person(String fName, String lName, LocalDate DOB) {
        this.fName = fName;
        this.lName = lName;
        this.DOB = DOB;
        numberOfPeople++;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        if (this.DOB != null) {
            return Period.between(this.DOB, currentDate).getYears();
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "First Name: " + this.fName + " | Last Name: " + this.lName + " | DOB: " + this.DOB + " | Age: " + this.getAge();
    }

    public static void main(String[] args) {
        Person josh = new Person("Josh", "DB", LocalDate.parse("2002-03-11"));
        Person dave = new Person("Dave", "Smith", LocalDate.parse("1999-04-12"));
        Person bob = new Person("Bob", "Simpson", LocalDate.parse("2000-09-16"));
        Person alice = new Person("Alice", "Inwonderland", LocalDate.parse("1980-01-31"));
        System.out.println(josh);
        System.out.println(dave);
        System.out.println(bob);
        System.out.println(alice);
        System.out.println("Number of people: " + Person.numberOfPeople);
    }
}


