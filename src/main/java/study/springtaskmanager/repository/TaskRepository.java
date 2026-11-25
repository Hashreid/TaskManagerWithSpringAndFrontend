package study.springtaskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import study.springtaskmanager.entity.Task;
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
