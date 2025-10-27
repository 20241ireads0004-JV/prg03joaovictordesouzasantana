/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author user
 */
public abstract class Forma {
    //atributo
    private String nome;

    //metodo construtor
    public Forma(String nome) {
        this.nome = nome;
    }

    //metodo getter para "pegar" o nome da forma
    public String getNome() {
        return nome;
    }
    
    //metodo padrão para formas 2D e 3D
    public abstract double obterArea();
    
    public double obterVolume(){
    return 0.0;
    }
    
    //metodo para mostrar o nome da forma
    @Override
    public String toString() {
        return "Forma: " + nome;
    }
}
