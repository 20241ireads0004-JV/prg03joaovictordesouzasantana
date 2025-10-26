/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author user
 */
public class Circulo extends Forma2D {
    private double raio; 

    //metodo construtor
    public Circulo(double raio) {
        
        //preenche o construtor da classe mãe com o nome Circulo
        super("Circulo");
        this.raio = raio;
    }

    @Override
    public double obterArea() { 
        
        //faz o calculo da area usando a formula do circulo
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public String toString() {
        
        //retorna o nome da forma e o raio do circulo
        return super.toString() + " (raio = " + raio + ")";
    }
}
