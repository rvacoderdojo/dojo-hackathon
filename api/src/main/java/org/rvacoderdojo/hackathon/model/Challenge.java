package org.rvacoderdojo.hackathon.model;

import javax.persistence.*;

/**
 * Created by mpegram on 7/31/16.
 */
@Entity
@Table(name="challenges")
public class Challenge {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String code;
    private String title;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
