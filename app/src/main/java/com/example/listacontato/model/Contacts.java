package com.example.listacontato.model;

public class Contacts {
    private String name;
    private String phone;

    public Contacts() {
    }

    public Contacts(String nome, String phone) {
        this.name = nome;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
