/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author user
 */
public class PagamentoPix implements Pagamento{
    //atributo do valor da compra
    private double valor;

    public PagamentoPix(double valor) {
        this.valor = valor;
    }
    
    //sobrescreve da interface Pagamento
    @Override
    //metodo para calcular o valor total com 2% de cashback
    public double calcularTotal() {
        return valor * 0.98; //inclui os 2% de cashback
    }

    //sobrescreve da interface Pagamento
    @Override
    //método para imprimir o recibo
    public void imprimeRecibo() {
        System.out.println("---- Recibo de Pagamento via Pix ----");
        System.out.println("Valor original: R$ " + valor);
        System.out.println("Cashback de 2% aplicado.");
        System.out.println("Total a pagar: R$ " + calcularTotal());
        System.out.println("--------------------------------------");
    }
}
