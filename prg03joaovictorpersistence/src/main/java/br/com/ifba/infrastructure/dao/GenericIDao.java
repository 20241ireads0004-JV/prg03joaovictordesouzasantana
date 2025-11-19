/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.infrastructure.dao;

import br.com.ifba.infrastructure.entity.PersistenceEntity;
import java.util.List;

//Interface para CRUD
public interface GenericIDao<Entity extends PersistenceEntity> {
    
    //Salva entidade
    public abstract Entity save(Entity obj);

    //Atualiza entidade existente
    public abstract Entity update(Entity obj);

    //Exclui entidade existente
    public abstract void delete(Entity obj);

    //Retorna todas entidades existentes
    public abstract List<Entity> findAll();

    //Busca pelo ID
    public abstract Entity findById(Long id);
    
    
}
