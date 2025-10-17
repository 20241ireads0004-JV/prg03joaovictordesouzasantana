/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.view;

/**
 *
 * @author user
 */
public class Sessao {
    
    //atributos
    private Long id;
    private Usuario usuario;
    private String token;

    //metodos getters e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    
    //construtor padrao
    public Sessao(){  
    }

    //construtor para preencher o objeto.
    public Sessao(Long id, Usuario usuario, String token){
        this.id = id;
        this. usuario = usuario;
        this.token = token;
    }
    //metodo toString para deixar as informações organizadas para leitura do usuario
     public String toString(){
        return "Sessao [ token: '" + token + "', usuario: '" + usuario.getNomeUsuario() + "' ]";
    }
}
