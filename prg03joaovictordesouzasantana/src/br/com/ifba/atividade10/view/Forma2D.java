/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author user
 */
public abstract class Forma2D extends Forma{
    
    public Forma2D(String nome) {
        
        //Utiliza o metodo construtor da classe mãe(Forma)
        super(nome);
    }
    
    //metodo em que cada forma 2D terá sua própria maneira de calcular  
    @Override
    public abstract double obterArea();
}
