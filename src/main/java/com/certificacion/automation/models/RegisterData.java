package com.certificacion.automation.models;

public class RegisterData {

    private String email;
    private String name;
    private String phone;

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public RegisterData(String email, String name, String phone) {
        this.email = email;
        this.name = name;
        this.phone = phone;
    }

}
