package motoProject2017.EntityClasses;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Ksenia on 13.01.2017.
 */
@Entity
@Table(name = "thistory")
public class HistoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idhistory")
    private Long IdHistory;

    public Long getIdHistory() {
        return IdHistory;
    }

    public void setIdHistory(Long idHistory) {
        this.IdHistory = idHistory;
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
    @Column(name = "title",length = 100,unique = true)
    private String Title;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
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

    @Column(name = "picture_url")
    private String Picture_url;

    public String getPicture_url() {
        return Picture_url;
    }

    public void setPicture_url(String picture_url) {
        this.Picture_url = picture_url;
    }

    public HistoryEntity() {
    }

    public HistoryEntity(Long idHistory, String section, String title, String content, String picture_url) {
        this.IdHistory=idHistory;
        this.Section = section;
        this.Title = title;
        this.Content = content;
        this.Picture_url = picture_url;
    }
}
