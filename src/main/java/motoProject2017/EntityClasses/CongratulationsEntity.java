package motoProject2017.EntityClasses;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by Ksenia on 13.01.2017.
 */

@Entity
@Table(name="tcongratulations")
public class CongratulationsEntity implements Serializable {

    @Id
    @Column(name="idcongratulations")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long IdCongr;

    public Long getIdCongr(){return IdCongr;}
    public void setIdCongr(Long IdCongr){this.IdCongr = IdCongr;}

    @NotNull
    @Column(name = "section")
    private Long Section;

    public Long getSection(){return Section;}
    public void setSection(Long Section){this.Section=Section;}

    @NotNull
    @Column(name = "title", length = 100)
    private String Title;

    public String getTitle(){return Title;}
    public  void setTitle(String Title){this.Title=Title;}

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
    @Column(name = "picture_url")
    private String picture_url;

    public String getPicture_url() {
        return picture_url;
    }

    public void setPicture_url(String picture_url) {
        this.picture_url = picture_url;
    }

    public CongratulationsEntity(Long idCongr, Long section, String title, String content, String picture_url) {
        this.IdCongr = idCongr;
        this.Section = section;
        this.Title = title;
        this.Content = content;
        this.picture_url = picture_url;
    }

    public CongratulationsEntity() {
    }
}
