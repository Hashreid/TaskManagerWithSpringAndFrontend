package study.springtaskmanager.service;

import org.springframework.stereotype.Service;
import study.springtaskmanager.entity.Task;
import study.springtaskmanager.repository.TaskRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public void addTask(Task task) {

    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public List<Task> getTasksByDate(LocalDate date) {
        return List.of();
    }

    public void deleteTask(long id) {
        taskRepository.deleteById(id);
    }
}
