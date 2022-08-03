package com.sofka.TallerPractico;

public class Alumnos {

    //Atributos
    public String name;
    private int age;
    public int grade;
    protected int identitycard;

    //metodos getter y setter

    public String getName() {
        return name;
    }
    public int getIdentitycard() {
        return identitycard;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setIdentitycard(int identitycard) {
        this.identitycard = identitycard;
    }
}
