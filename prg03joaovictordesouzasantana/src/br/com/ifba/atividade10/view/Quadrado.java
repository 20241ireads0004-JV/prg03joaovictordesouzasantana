/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author user
 */
public class Quadrado extends Forma2D {
    private double lado;

    //metodo construtor
    public Quadrado(double lado) {
        
        //preenche o construtor da classe mãe com o nome Quadrado
        super("Quadrado");
        this.lado = lado;
    }

    @Override
    public double obterArea() {
        
        //faz o calculo da area usando a formula do quadrado
        return lado * lado;
    }

    @Override
    public String toString() {
        
        //retorna o nome da forma o tamanho do lado do quadrado
        return super.toString() + " (lado = " + lado + ")";
    }
}
