package org.launchcode.cheesemvc.models;

import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by kajuh_000 on 6/8/2017.
 */
public class User {

    @NotNull
    @Size(min = 5, max = 15)
    private String username;

    @Email
    private String email;

    @NotNull
    @Size(min = 6, max = 15)
    private String password;

    private int userId;
    private static int nextId = 1;

    public User(String username, String email, String password){
        this();
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User(){
        userId = nextId;
        nextId++;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
