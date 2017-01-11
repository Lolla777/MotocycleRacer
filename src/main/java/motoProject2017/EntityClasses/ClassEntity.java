package motoProject2017.EntityClasses;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Ksenia on 11.01.2017.
 */
@Entity
@Table(name = "tclass")
public class ClassEntity implements Serializable {

    @Id
    @Column(name = "idclass")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long IdClass;
    public Long getIdClass(){return  IdClass;}
    public void setIdClass (Long IdClass){this.IdClass = IdClass;}

    @NotNull
    @Column(name = "name", unique = true, length = 50)
    private String Name;
    public String getName(){return  Name;}
    public void setName(String Name){ this.Name = Name;}

    @NotNull
    @Column(name = "specification")
    private String Specification;
    public String getSpecification(){return Specification;}
    public void setSpecification(String Specification){this.Specification = Specification;}

    @NotNull
    @Column(name = "picture_url", unique = true)
    private String Picture_Url;
    public String getPicture_Url(){return Picture_Url;}
    public void setPicture_Url(String Picture_url){this.Picture_Url = Picture_url;}

//    @JoinTable
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "classentity")
//     private ArrayList<ClassEntity> classes = new ArrayList<ClassEntity>();

    public ClassEntity(Long idClass,String name,String specification, String picture_Url){
        this.IdClass = idClass;
        this.Name= name;
        this.Specification = specification;
        this.Picture_Url = picture_Url;
    }

    public ClassEntity(){

    }
}
