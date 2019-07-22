package br.com.treinaweb.twgerenciadortarefas.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.treinaweb.twgerenciadortarefas.modelos.Tarefa;

public interface RepositorioTarefa extends JpaRepository<Tarefa, Long>{
	
	//jpql
	@Query("select t from Tarefa t where t.usuario.email = :emailUsuario")
	List<Tarefa> carregarTarefaPorUsuario(@Param("emailUsuario") String email);
	
}
