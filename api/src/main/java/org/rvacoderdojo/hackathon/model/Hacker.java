package org.rvacoderdojo.hackathon.model;

import javax.persistence.*;

/**
 * Represents a participant or team in the Hackathon.
 */
@Entity
@Table(name="hackers")
public class Hacker {

    @Id
//    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

