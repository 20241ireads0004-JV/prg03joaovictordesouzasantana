/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.view;

/**
 *
 * @author user
 */
public class ContaBanco {
    
    //atributos da classe
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //metodos getters e setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    //metodo construtor
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }
    
    //funcionalidades
    public void estadoAtual(){ //Mostra o estado da conta
        
        System.out.println("--------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }
    //abre a conta
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        
        //verifica o tipo de conta
        if ("CC".equals(t)) {
            this.setSaldo(50);
        } else if ("CP".equals(t)){
            this.setSaldo(150);
        }
        
        System.out.println("Conta foi aberta!!");
    }
    
    //fecha somente se o saldo for igual a 0
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada, pois ainda há saldo");
        } else if(this.getSaldo() < 0){
            System.out.println("Conta não pode ser fechada, pois tem débito");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float valor){
        if(this.isStatus()){ //verifica se a conta está aberta, para poder depositar
            
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito foi realizado na conta de " + this.getDono());
        }else{ // se não estiver, mostra mensagem
            System.out.println("Não é possível depositar em uma conta fechada!");
        }
            
    }
    
    public void sacar(float valor){
        if(this.isStatus()){ //verifica se a conta esta aberta
            if(this.getSaldo() >= valor){ //verifica se o saldo e suficiente
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("O Saque foi realizado na conta de " + this.getDono());
            }else{ //se não for, mostra mensagem que não é possivel realizar saque
                System.out.println("O Saldo é insuficiente para saque!");
            }
        }else{ 
            System.out.println("É Impossível sacar de uma conta fechada!!");
        }
            
    }
    
    public void pagarMensal(){ //vai cobrar a mensalidade de acordo com o tipo
        int valor = 0;
        
        if ("CC".equals(this.getTipo())) {
            valor = 12;
        }else if("CP".equals(this.getTipo())){
            valor = 20;
        }
        
        if (this.isStatus()){ //verifica se está aberta a conta
            this.setSaldo(this.getSaldo() - valor); //subtrai o valor da mensalidade
            System.out.println("A Mensalidade foi paga com sucesso por " + this.getDono());
        }else{
            System.out.println("É Impossível pagar uma conta fechada");
        }
    }
}
