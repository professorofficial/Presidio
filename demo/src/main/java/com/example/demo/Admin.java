package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Admin {
    @Id
    @GeneratedValue
    private int id;
    private String username;
    private String password;
    private String role;


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
   

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }


}
