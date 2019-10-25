package org.stlyouthjobs.models;


import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.URL;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class NewApplicant {

    @Id
    @GeneratedValue
    private int id;


    @NotNull
    @URL
    @Size(min = 2, max = 100)
    private String gitHub;

    @NotNull
    @URL
    @Size(min = 2, max = 100)
    private String linkedIn;

    @NotNull
    @Size(min = 3, max = 20, message = "Name must be between 3 and 20 Characters")
    private String name;

    @NotNull
    @Pattern(regexp = "\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}",
            message = "Invalid phone number")
    private String phoneNum;

    @Email
    private String email;

    public NewApplicant() {
        this.id = id;
        this.gitHub = gitHub;
        this.linkedIn = linkedIn;
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getGitHub() {
        return gitHub;
    }

    public void setGitHub(String gitHub) {
        this.gitHub = gitHub;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}