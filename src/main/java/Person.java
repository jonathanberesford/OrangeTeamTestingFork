import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;


public class Person {
    String fName;
    String lName;
    LocalDate DOB;

    public static ArrayList<Person> createdPeople = new ArrayList<Person>();
    public Person () {

    }

    public Person(String fName, String lName, LocalDate DOB) {
        this.fName = fName;
        this.lName = lName;
        this.DOB = DOB;
        createdPeople.add(this);
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

}


