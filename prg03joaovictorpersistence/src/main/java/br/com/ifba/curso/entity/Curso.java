/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.entity;

import br.com.ifba.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


 //Representa a entidade Curso mapeada para o banco de dados.
 
@Entity
public class Curso extends PersistenceEntity{

    private String nome;
    private String codigo;

    // aqui é construtor padrão exigido pelo JPA
    public Curso() {}

    //o construtor auxiliar para criar um novo curso
    public Curso(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
