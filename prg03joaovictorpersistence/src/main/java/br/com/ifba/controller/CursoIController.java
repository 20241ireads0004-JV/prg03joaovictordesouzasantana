/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.controller;
import br.com.ifba.curso.entity.Curso;
import java.util.List;
/**
 *
 * @author user
 */
public interface CursoIController {
    //salva um novo Curso no sistema.
    Curso save(Curso curso);

    //atualiza um Curso existente ou seja, edita
    Curso update(Curso curso);

    //exclui um curso selecionado
    void delete(Curso curso);

    //retornar  todos os cursos cadastrados
    List<Curso> findAll();
    
    //busca um curso pelo codigo
    Curso findByCodigo(String codigo);

    //busca um curso por id
    Curso findById(Long id);

    //busca um curso por nome
    Curso findByName(String name);
}
