package motoProject2017.EntityClasses;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by Ksenia on 11.01.2017.
 */
@Entity
@Table(name = "ttype")
public class TypeEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idtupe")
    private Long IdType;

    public Long getIdType(){return  IdType;}
    public void setIdType(Long IdType){this.IdType = IdType;}

//    @NotNull
//    @ManyToOne
//    @Column(name = "class", length = 100, nullable = false, unique = true )
//    private ClassEntity Class;

//    public ClassEntity getClassEntity(){return Class;}
//    public void setClassEntity(ClassEntity Class){this.Class = Class;}

    @NotNull
    @Column(name = "name", length = 100, nullable = false, unique = true)
    private String Name;
    public String getName(){return Name;}
    public void setName(String Name){this.Name = Name;}

    @NotNull
    @Column (name = "specification", nullable = false)
    private String Specification;
    public String getSpecification(){return Specification;}
    public void setSpecification(String Specification){this.Specification = Specification;}

    @NotNull
    @Column(name = "picture_url", nullable = false)
    private String Picture_Url;
    public  String getPicture_Url(){return Picture_Url;}
    public void setPicture_Url(String Picture_Url){this.Picture_Url = Picture_Url;}

    @Column(name = "picture_url2")
    private String Picture_Url2;
    public String getPicture_Url2(){return Picture_Url2;}
    public void setPicture_Url2(String Picture_Url){this.Picture_Url2 = Picture_Url2;}

    public TypeEntity(Long idtype,ClassEntity aclass,String name,String specification,String picture_url,String picture_url2){
        this.IdType = idtype;
//        this.Class = aclass;
        this.Name = name;
        this.Specification = specification;
        this.Picture_Url = picture_url;
        this.Picture_Url2 = picture_url2;
    }


    public TypeEntity(){

    }
}
