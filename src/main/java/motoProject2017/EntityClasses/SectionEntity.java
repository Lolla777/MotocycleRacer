package motoProject2017.EntityClasses;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Ksenia on 14.01.2017.
 */
@Entity
@Table(name = "tsection")
public class SectionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idsection")
    private Long IdSection;

    public Long getIdSection() {
        return IdSection;
    }

    public void setIdSection(Long idSection) {
        this.IdSection = idSection;
    }

    @NotNull
    @Column(name = "name",length = 7,unique = true)
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public SectionEntity() {
    }

    public SectionEntity(Long idSection,String name) {
        this.IdSection=idSection;
        this.Name = name;
    }
}
