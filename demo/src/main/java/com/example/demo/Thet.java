package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Thet {
    @Id
    @GeneratedValue
    private int id;
    private String the_name;
    private String movie_name;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getThe_name() {
        return this.the_name;
    }

    public void setThe_name(String the_name) {
        this.the_name = the_name;
    }

    public String getMovie_name() {
        return this.movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

}
