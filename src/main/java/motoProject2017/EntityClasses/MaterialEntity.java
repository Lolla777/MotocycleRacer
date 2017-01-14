package motoProject2017.EntityClasses;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Ksenia on 13.01.2017.
 */
@Entity
@Table(name = "tmaterial")
public class MaterialEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idmaterial")
    private Long IdMaterial;

    public Long getIdMaterial() {
        return IdMaterial;
    }

    public void setIdMaterial(Long idMaterial) {
        this.IdMaterial = idMaterial;
    }

    @NotNull
    @Column(name = "section")
    private String Section;

    public String getSection() {
        return Section;
    }

    public void setSection(String section) {
        this.Section = section;
    }

    @NotNull
    @Column(name = "name",length = 100)
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    @NotNull
    @Column(name = "adddata")
    private Date AddData;

    public Date getAddData() {
        return AddData;
    }

    public void setAddData(Date addData) {
        this.AddData = addData;
    }

    @NotNull
    @Column(name = "content")
    private String Content;

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        this.Content = content;
    }

    @NotNull
    @Column(name = "iduser")
    private Long User;

    public Long getUser() {
        return User;
    }

    public void setUser(Long user) {
        this.User = user;
    }

    @NotNull
    @Column(name = "picture_url")
    private String Picture_url;

    public String getPicture_url() {
        return Picture_url;
    }

    public void setPicture_url(String picture_url) {
        Picture_url = picture_url;
    }

    public MaterialEntity() {
    }

    public MaterialEntity(Long idMaterial,String section, String name, Date addData, String content, Long user, String picture_url) {
        this.IdMaterial= idMaterial;
        this.Section = section;
        this.Name = name;
        this.AddData = addData;
        this.Content = content;
        this.User = user;
        this.Picture_url = picture_url;
    }
}
