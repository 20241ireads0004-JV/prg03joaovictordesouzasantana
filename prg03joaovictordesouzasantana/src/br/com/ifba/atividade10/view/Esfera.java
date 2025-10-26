/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author user
 */
public class Esfera extends Forma3D {
    private double raio;

    //metodo construtor
    public Esfera(double raio) {
        
        //preenche o metodo construtor da classe mãe com o nome Esfera
        super("Esfera");
        this.raio = raio;
    }

    @Override
    public double obterArea() {
        
        //faz o calculo da area usando a formula da area de uma esfera
        return 4 * Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double obterVolume() {
        
        //faz o calculo do volume usando a formula do volume de uma esfera
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }

    @Override
    public String toString() {
        
        //retorna o nome da forma e o tamanho do raio da esfera
        return super.toString() + " (raio = " + raio + ")";
    }
}
