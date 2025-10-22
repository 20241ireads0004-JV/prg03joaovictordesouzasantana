/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author user
 */
public class PagamentoDinheiro implements Pagamento{
    //atributo do valor da compra
    private double valor;

    public PagamentoDinheiro(double valor) {
        this.valor = valor;
    }
    
  
    //sobrescreve da interface Pagamento
    @Override
    //metodo para calcular o valor total com 10% de desconto
    public double calcularTotal() {
        return valor * 0.90; // ou seja, aplica 10% de desconto
    }

    //sobrescreve da interface Pagamento
    @Override
    //método para imprimir o recibo
    public void imprimeRecibo() {
        System.out.println("---- Recibo de Pagamento em Dinheiro ----");
        System.out.println("Valor original: R$ " + valor);
        System.out.println("Desconto de 10% aplicado.");
        System.out.println("Total a pagar: R$ " + calcularTotal());
        System.out.println("------------------------------------------");
    }
}
