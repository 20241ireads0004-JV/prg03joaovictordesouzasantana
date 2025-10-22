/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author user
 */
public interface Pagamento {
    //metodo para calcular o valor final que sera pago
    public double calcularTotal();
    //metodo para imprimir o recibo com as informacoes
    public void imprimeRecibo();
}
