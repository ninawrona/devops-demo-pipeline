package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import via.doc1.devopsdemo.model.Task;

public interface TaskRepository extends JpaRepository<Task, String> {
}
