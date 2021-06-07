package com.gfa.reddit.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private Long vote = 0L;
    private String URL;

    @ManyToOne
    @JoinColumn
    private User user;


    @Temporal(value = TemporalType.DATE)
    private Date date;

    public Post() {
        date = new Date();
    }

    public Post(String title, String URL) {
        this();
        this.title = title;
        this.URL = URL;
        this.vote = 0L;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getVote() {
        return vote;
    }

    public void setVote(Long vote) {
        this.vote = vote;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public void voteDown() {
        this.vote--;
    }

    public void voteUp() {
        this.vote++;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}