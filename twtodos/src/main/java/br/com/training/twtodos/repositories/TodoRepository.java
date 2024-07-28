package br.com.training.twtodos.repositories;

import br.com.training.twtodos.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
