/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author user
 */
public class Cubo extends Forma3D {
    private double lado;

    //metodo construtor
    public Cubo(double lado) {
        
        //preenche o metodo construtor da classe mãe com o nome Cubo
        super("Cubo");
        this.lado = lado;
    }

    @Override
    public double obterArea() {
        
        //faz o calculo da area usando a formula da area de um cubo
        return 6 * Math.pow(lado, 2);
    }

    @Override
    public double obterVolume() {
        
        //faz o calculo do volume usando a formula do volume de um cubo
        return Math.pow(lado, 3);
    }

    @Override
    public String toString() {
        
        //retorna o nome da forma e o tamanho do lado do cubo
        return super.toString() + " (lado = " + lado + ")";
    }
}
