import javax.persistence.Entity;
import java.util.Objects;
@Entity
public class Person {

    private int personId;
    private String personName;
    private String personAddress;
    private String personPhone;

    public Person(int personId, String personName, String personAddress, String personPhone) {
        this.personId = personId;
        this.personName = personName;
        this.personAddress = personAddress;
        this.personPhone = personPhone;
    }

    public Person() {
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
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
        return personId == person.personId && Objects.equals(personName, person.personName) && Objects.equals(personAddress, person.personAddress) && Objects.equals(personPhone, person.personPhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId, personName, personAddress, personPhone);
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", personName='" + personName + '\'' +
                ", personAddress='" + personAddress + '\'' +
                ", personPhone='" + personPhone + '\'' +
                '}';
    }
}
