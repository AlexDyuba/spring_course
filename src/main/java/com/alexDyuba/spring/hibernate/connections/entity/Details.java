package com.alexDyuba.spring.hibernate.connections.entity;

import javax.persistence.*;

@Entity
@Table(name = "details")
public class Details {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "city")
    private String city;

    @Column(name = "phone_number")
    private String number;

    @Column(name = "email")
    private String email;

    @OneToOne(mappedBy = "employeeDetails",
            cascade = CascadeType.ALL) // support with this command we say look connection
    // in field employeeDetails. This field contain in Employee class
    private Employee employee;

    public Details(String city, String number, String email) {
        this.city = city;
        this.number = number;
        this.email = email;
    }

    public Details() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Details{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", number='" + number + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
