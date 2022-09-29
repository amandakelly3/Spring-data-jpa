package prova.questaoUm;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "ToDo", path = "ToDo")
public interface ToDoRepository extends PagingAndSortingRepository<ToDo, Long> {
	List<ToDo> findByName(String name);
	
}
