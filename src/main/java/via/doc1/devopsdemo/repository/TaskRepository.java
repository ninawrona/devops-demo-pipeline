package via.doc1.devopsdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import via.doc1.devopsdemo.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, String> {
}