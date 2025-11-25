/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.service;
import br.com.ifba.curso.entity.Curso;
import java.util.List;
import java.util.Optional;
/**
 *
 * @author user
 */
public interface CursoIService {
    
    Curso save(Curso curso);

    Curso update(Curso curso);

    void delete(Curso curso);

    List<Curso> findAll();
    
    Curso findByCodigo(String codigo);
    
    Optional<Curso> findById(Long id);

    Curso findByName(String name);
}
