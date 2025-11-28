/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.entity;

import br.com.ifba.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

 //Representa a entidade Curso mapeada para o banco de dados.
 
@Entity
@Data
@AllArgsConstructor
public class Curso extends PersistenceEntity{

    private String nome;
    private String codigo;
}
