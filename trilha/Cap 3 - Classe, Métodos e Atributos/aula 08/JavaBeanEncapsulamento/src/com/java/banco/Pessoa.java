package com.java.banco;

import java.io.Serializable;

public class Pessoa implements Serializable {

    private String nome;

    // Modificadores Getters and Setters manual


    // Getter
    public String getNome() {
        return nome;
    }

    // Setter
    public void setNome(String nome) {
        this.nome = nome;
    }
}
