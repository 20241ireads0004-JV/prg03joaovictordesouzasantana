/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author user
 */
public abstract class Forma3D extends Forma{
    
    public Forma3D(String nome) {
        
        //utiliza o metodo construtor da classe mae(Forma)
        super(nome);
    }

    //metodo para calculo da area
    @Override
    public abstract double obterArea();
    
    //metodo para calculo do volume, todas formas 3D usarao, inicializa com 0
    public double obterVolume() {
        return 0.0;
    }
}
