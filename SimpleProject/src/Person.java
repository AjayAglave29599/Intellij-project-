import java.util.Objects;

public class Person {

    private int personid;
    private String personName;
    private String personAsress;
    private String personPhone;

    public Person(int personid, String personName, String personAsress, String personPhone) {
        this.personid = personid;
        this.personName = personName;
        this.personAsress = personAsress;
        this.personPhone = personPhone;
    }

    public Person() {
    }

    public int getPersonid() {
        return personid;
    }

    public void setPersonid(int personid) {
        this.personid = personid;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonAsress() {
        return personAsress;
    }

    public void setPersonAsress(String personAsress) {
        this.personAsress = personAsress;
    }

    public String getPersonPhone() {
        return personPhone;
    }

    public void setPersonPhone(String personPhone) {
        this.personPhone = personPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return personid == person.personid && Objects.equals(personName, person.personName) && Objects.equals(personAsress, person.personAsress) && Objects.equals(personPhone, person.personPhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personid, personName, personAsress, personPhone);
    }

    @Override
    public String toString() {
        return "Person{" +
                "personid=" + personid +
                ", personName='" + personName + '\'' +
                ", personAsress='" + personAsress + '\'' +
                ", personPhone='" + personPhone + '\'' +
                '}';
    }
}
