package motoProject2017.EntityClasses;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Ksenia on 13.01.2017.
 */
@Entity
@Table(name = "tmanufacturer")
public class ManufacturerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idmanufacturer")
    private Long IdManuf;

    public Long getIdManuf() {
        return IdManuf;
    }

    public void setIdManuf(Long idManuf) {
        this.IdManuf = idManuf;
    }

    @NotNull
    @Column(name = "name",unique = true)
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public ManufacturerEntity() {
    }

    public ManufacturerEntity(Long idManuf,String name) {
        this.IdManuf = idManuf;
        this.Name = name;
    }
}
