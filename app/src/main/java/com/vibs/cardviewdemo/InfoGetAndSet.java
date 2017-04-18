package com.vibs.cardviewdemo;

/**
 * Created by root on 17/4/17.
 */

public class InfoGetAndSet {
    private String name;
    private String designation;
    private boolean gender;

    InfoGetAndSet(String name,boolean gender,String designation){

        this.designation=designation;
        this.name=name;
        this.gender=gender;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }


}
