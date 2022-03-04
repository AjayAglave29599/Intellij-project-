import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Employee extends Person{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long employeeID;
    private String departmentName;
    @OneToOne(cascade = CascadeType.ALL)
    private Laptop laptop;
    private boolean active;
    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true,
            targetEntity = ContactDetails.class,
            fetch = FetchType.LAZY)
    private List<ContactDetails> contactDetails;

    // Unidirectional Relationship
    //private Set<ContactDetails> contactDetails;

    public Employee() {
    }

    public Employee(int id, String name, String address, String phone, long employeeID, String departmentName, Laptop laptop) {
        super(id, name, address, phone);
        this.employeeID = employeeID;
        this.departmentName = departmentName;
        this.laptop = laptop;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(long employeeID) {
        this.employeeID = employeeID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return employeeID == employee.employeeID && Objects.equals(departmentName, employee.departmentName) && Objects.equals(laptop, employee.laptop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), employeeID, departmentName, laptop);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", departmentName='" + departmentName + '\'' +
                ", laptop=" + laptop +
                '}';
    }
}
