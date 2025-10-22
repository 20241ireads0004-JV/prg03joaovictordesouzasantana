/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author user
 */
public class PagamentoCartao implements Pagamento{
    //atributo do valor da compra
    private double valor;

    public PagamentoCartao(double valor) {
        this.valor = valor;
    }
    
    //sobrescreve da interface Pagamento
    @Override
    //metodo para calcular o valor total com taxa de 5%
    public double calcularTotal() {
        return valor * 1.05; //inclui os 5% no valor original
    }

    //sobrescreve da interface Pagamento
    @Override
    //método para imprimir o recibo
    public void imprimeRecibo() {
        System.out.println("---- Recibo de Pagamento com Cartão ---");
        System.out.println("Valor original: R$ " + valor);
        System.out.println("Taxa de 5% aplicada.");
        System.out.println("Total a pagar: R$ " + calcularTotal());
        System.out.println("----------------------------------------");
    }
}
