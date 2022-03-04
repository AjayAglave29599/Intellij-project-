import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;


@Entity
public class Laptop {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="processor")
    private int lid;
@Column(name = "processor")
    private String cpu;
@Column(name="Hard disk",length = 20,nullable = true,insertable = true,table = "laptop",updatable = true)
    private String hdd ;
private String ram;
    @Temporal(TemporalType.TIMESTAMP)
    private Date mgf;

    public Laptop() {
    }

    public Laptop(int lid, String cpu, String hdd, String ram) {
        this.lid = lid;
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
    }



    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return lid == laptop.lid && Objects.equals(cpu, laptop.cpu) && Objects.equals(hdd, laptop.hdd) && Objects.equals(ram, laptop.ram);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lid, cpu, hdd, ram);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", cpu='" + cpu + '\'' +
                ", hdd='" + hdd + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }
}
