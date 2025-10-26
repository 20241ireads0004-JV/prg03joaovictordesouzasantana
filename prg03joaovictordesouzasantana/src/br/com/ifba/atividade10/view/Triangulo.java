/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author user
 */
public class Triangulo extends Forma2D {
    private double base;
    private double altura;

    //metodo construtor
    public Triangulo(double base, double altura) {
        
        //preenche o construtor da classe mãe com o nome Triangulo
        super("Triangulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double obterArea() {
        
        //faz o calculo da area usando a formula do triangulo
        return (base * altura) / 2;
        
    }

    @Override
    public String toString() {
        
        //retorna o nome da forma, a base e a altura do triangulo
        return super.toString() + " (base = " + base + ", altura = " + altura + ")";
    }
}
