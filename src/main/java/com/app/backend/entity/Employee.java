package com.app.backend.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "name_with_initials")
    private String nameWithInitials;
    @Column(name = "dob")
    private Date dob;
    @Column(name = "address")
    private String address;
    @Column(name = "image_url")
    private String imageUrl;
    @Column(name = "marital_status_id")
    private int maritalStatusId;
    @Column(name = "team_id")
    private int teamId;
    @Column(name = "designation_id")
    private int designationId;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String fullName, String nameWithInitials, Date dob, String address, String imageUrl, int maritalStatusId, int teamId, int designationId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.nameWithInitials = nameWithInitials;
        this.dob = dob;
        this.address = address;
        this.imageUrl = imageUrl;
        this.maritalStatusId = maritalStatusId;
        this.teamId = teamId;
        this.designationId = designationId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNameWithInitials() {
        return nameWithInitials;
    }

    public void setNameWithInitials(String nameWithInitials) {
        this.nameWithInitials = nameWithInitials;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getMaritalStatusId() {
        return maritalStatusId;
    }

    public void setMaritalStatusId(int maritalStatusId) {
        this.maritalStatusId = maritalStatusId;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public int getDesignationId() {
        return designationId;
    }

    public void setDesignationId(int designationId) {
        this.designationId = designationId;
    }
}