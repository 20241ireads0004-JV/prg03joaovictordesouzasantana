/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author user
 */
public class Pirâmide extends Forma3D {
    private double ladobase;
    private double altura;

    //metodo construtor
    public Pirâmide(double ladobase, double altura) {
        
        ////preenche o metodo construtor da classe mãe com o nome Pirâmide
        super("Pirâmide");
        this.ladobase = ladobase;
        this.altura = altura;
    }

    @Override
    public double obterArea() { 
        
        //faz o calculo da area da base de uma pirâmide de base quadrangular
        double areaBase = ladobase * ladobase;
        
        //faz o calculo da area lateral de uma pirâmide de base quadrangular
        double areaLateral = ((ladobase * altura)/2) * 4;
        
        //retorna  a area total da pirâmide que é a soma da area da base e da area lateral
        return areaBase + areaLateral;
    }

    @Override
    public double obterVolume() {
        
        //faz o calculo da area usando a formula da area de uma pirâmide
        return (ladobase * ladobase * altura) / 3;
    }

    @Override
    public String toString() {
        
        //retorna o nome da forma,o tamanho do lado da base e a altura da pirâmide
        return super.toString() + " (lado da base = " + ladobase + ", altura = " + altura + ")";
    }
}
