package com.crr.domain;

import javax.persistence.*;

@Entity
public class Branches {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    //private Integer cityareaid;
    private String address;
    private String telephone;
    //多对一
    @ManyToOne
    @JoinColumn(name = "cityareaid")
    private Cityarea cityarea;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Cityarea getCityarea() {
        return cityarea;
    }

    public void setCityarea(Cityarea cityarea) {
        this.cityarea = cityarea;
    }
}
