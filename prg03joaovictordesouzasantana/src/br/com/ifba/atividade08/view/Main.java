/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.view;

import java.time.LocalDateTime;
import java.util.Arrays;
/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        
        //criacao dos perfils admin e usuario
        PerfilUsuario perfilAdmin = new PerfilUsuario(12345L, "Admin", Arrays.asList("Todas"));
        PerfilUsuario perfilUsuario = new PerfilUsuario(23456L, "Usuario", Arrays.asList("Poucas"));
        //criacao dos usuarios patati e patata
        Usuario patati = new Usuario(123L, perfilAdmin, "Gustavo", "gustavo@gmail.com", "gustavo00", LocalDateTime.now(), true);
        Usuario patata = new Usuario(234L, perfilUsuario, "Iohan", "iohan@gmail.com", "iohan00", LocalDateTime.now(), true);
        //criacao das sessoes
        Sessao sessao1 = new Sessao(00L, patati, "soupatati");
        Sessao sessao2 = new Sessao(01L, patata, "soupatata");
        //criacao das auditorias
        LogAuditoria logAud = new LogAuditoria(10L, patati, "Fez merda", LocalDateTime.now(), "100.000.1.10");
        LogAuditoria logAud2 = new LogAuditoria(11L, patata, "Fez merda tambem", LocalDateTime.now(), "111.000.1.10");
        
        //mostrando algumas informacoes dos usuario registrados
        System.out.println("=== Usuário 1 ===");
        System.out.println("ID: " + patati.getId());
        System.out.println("Nome: " + patati.getNomeUsuario());
        System.out.println("Email: " + patati.getEmail());
        System.out.println("Login: " + patati.getUltimoLogin());
        System.out.println("Descrição do Perfil: " + patati.getPerfil().getDescricao());
        System.out.println("Permissões: " + patati.getPerfil().getPermissoes());
        System.out.println("Usuário da Sessão: " + sessao1.getUsuario().getNomeUsuario());
        System.out.println("Data/Hora: " + logAud.getDataHora());
        
        //linha em branco para separar
        System.out.println("");
        
        System.out.println("=== Usuário 2 ===");
        System.out.println("ID: " + patata.getId());
        System.out.println("Nome: " + patata.getNomeUsuario());
        System.out.println("Email: " + patata.getEmail());
        System.out.println("Login: " + patata.getUltimoLogin());
        System.out.println("Descrição do Perfil: " + patata.getPerfil().getDescricao());
        System.out.println("Permissões: " + patata.getPerfil().getPermissoes());
        System.out.println("Usuário da Sessão: " + sessao2.getUsuario().getNomeUsuario());
        System.out.println("Data/Hora: " + logAud2.getDataHora());
    }
}
