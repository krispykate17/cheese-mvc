package org.launchcode.cheesemvc.models;

/**
 * Created by kajuh_000 on 6/8/2017.
 */
public class User {
    private String username;
    private String email;
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
