/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.service;
import br.com.ifba.curso.entity.Curso;
import br.com.ifba.curso.repository.CursoRepository;
import br.com.ifba.infrastructure.util.StringUtil;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author user
 */
@Service
public class CursoService implements CursoIService{
    // DAO responsável pela comunicação com o banco de dados
    @Autowired
    private CursoRepository repository;
    
    private static final Logger log = LoggerFactory.getLogger(CursoService.class);
    // Salva um novo curso no sistema.
     // só q antes de salvar, aplica validações.
    @Override
    public Curso save(Curso curso) throws RuntimeException{

         //faz a verificação se o objeto curso é nulo
        if (curso == null) {
            throw new RuntimeException("Dados do" + " Curso não preenchidos.");
            
        } else if(curso.getId() != null) {
        throw new RuntimeException("Curso" + " já existente no Banco de Dados.");
        } else {
        //salva o curso
        log.info("Salvando o Objeto Curso!");
        return repository.save(curso);
        }
    }

    
    
     //edita ou melhor, atualiza um curso existente.
     //e aplica validações antes de atualizar.
    @Override
    public Curso update(Curso curso) {

    if (curso == null) {
        throw new RuntimeException("Curso não pode ser nulo!");
    }

    if (curso.getId() == null) {
        throw new RuntimeException("ID do curso é obrigatório para atualizar.");
    }

    if (StringUtil.isNullOrEmpty(curso.getNome())) {
        throw new RuntimeException("O nome do curso não pode ser vazio!");
    }

    // Verifica se já existe outro curso com o mesmo nome
    Curso cursoNome = repository.findByName(curso.getNome());
    if (cursoNome != null && !cursoNome.getId().equals(curso.getId())) {
        throw new RuntimeException("Já existe outro curso com esse nome!");
    }

    // Verifica se já existe outro curso com o mesmo código
    Curso cursoCodigo = repository.findByCodigo(curso.getCodigo());
    if (cursoCodigo != null && !cursoCodigo.getId().equals(curso.getId())) {
        throw new RuntimeException("Já existe outro curso com esse código!");
    }

    return repository.update(curso);
    }

    //esse deleta um curso.
     //mas igualmente aplica validações antes de excluir.
    @Override
    public void delete(Curso curso) {

        if (curso == null) {
            throw new RuntimeException("Curso não pode ser nulo!");
        }

        if (curso.getId() == null) {
            throw new RuntimeException("ID é obrigatório para deletar.");
        }
        repository.delete(curso);
        log.info("Curso excluído com sucesso!");
    }

    @Override
    public List<Curso> findAll() { //lista todos os cursos cadastrados.
        log.info("Listando todos os cursos.");
        return repository.findAll();
    }

    @Override
    public Optional<Curso> findById(Long id) { //busca um curso pelo ID, e com validação.

        if (id == null) {
            throw new RuntimeException("ID não pode ser nulo!");
        }

        return repository.findById(id);
    }
    
    @Override
    public Curso findByName(String name) { //busca curso pelo nome

        if (StringUtil.isNullOrEmpty(name)) {
            throw new RuntimeException("Nome não pode ser vazio!");
        }

        return repository.findByName(name);
    }

    @Override
    public Curso findByCodigo(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
