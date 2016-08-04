package org.rvacoderdojo.hackathon.model;

import javax.persistence.*;

/**
 * Created by mpegram on 7/31/16.
 */
@Entity
@Table(name="results")
public class Result {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "hackerid")
    private Hacker hacker;

    @OneToOne
    @JoinColumn(name = "challengeid")
    private Challenge challenge;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Hacker getHacker() {
        return hacker;
    }

    public void setHacker(Hacker hacker) {
        this.hacker = hacker;
    }

    public Challenge getChallenge() {
        return challenge;
    }

    public void setChallenge(Challenge challenge) {
        this.challenge = challenge;
    }
}
