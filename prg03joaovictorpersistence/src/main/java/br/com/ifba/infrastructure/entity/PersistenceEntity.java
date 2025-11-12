/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.infrastructure.entity;

import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass //A classe não será diretamente mapeada para uma tabela, mas as propriedades serão herdadas por outras classes

public class PersistenceEntity {
    
    @Id //marca como chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)//gera automaticamente o ID pelo banco de dados.
    private Long id;

    //getter e setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
