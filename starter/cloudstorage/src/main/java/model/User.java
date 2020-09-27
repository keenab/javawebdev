package model;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class User extends org.springframework.security.core.userdetails.User {
    private Integer userId;
    private String username;
    private String salt;
    private String password;
    private String firstName;
    private String lastName;

    public User(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

    public void setUserId(Integer x) {
        userId = x;
    }
    public Integer userId() {
        return userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String username() {
        return username;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
    public String getSalt() {
        return salt;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String password() {
        return password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
}

