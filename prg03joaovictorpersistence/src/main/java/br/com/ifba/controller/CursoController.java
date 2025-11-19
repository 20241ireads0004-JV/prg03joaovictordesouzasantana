/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.controller;
import br.com.ifba.curso.entity.Curso;
import br.com.ifba.service.CursoIService;
import br.com.ifba.service.CursoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author user
 */
@Controller
public class CursoController implements CursoIController{
    
    //instância da camada Service, que contém as regras de negócio
    @Autowired
    private CursoIService service;

    @Override
    public Curso save(Curso curso) {
        return service.save(curso);
    }

    @Override
    public Curso update(Curso curso) {
        return service.update(curso);
    }

    @Override
    public void delete(Curso curso) {
        service.delete(curso);
    }

    @Override
    public List<Curso> findAll() {
        return service.findAll();
    }

    @Override
    public Curso findById(Long id) {
        return service.findById(id);
    }

    @Override
    public Curso findByName(String name) {
        return service.findByName(name);
    }

    @Override
    public Curso findByCodigo(String codigo) {
        return service.findByCodigo(codigo);
    }
}
