/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.curso.repository;

import br.com.ifba.curso.entity.Curso;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{
        
    
    // Método específico para buscar cursos por nome
    Curso findByName(String nome); 
    
    // Método especifico para buscar curso pelo codigo
    Curso findByCodigo(String codigo);
 
    // Método especifico para atualizar o curso
    Curso update(Curso curso);
}
