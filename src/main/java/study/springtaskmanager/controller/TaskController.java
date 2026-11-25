package study.springtaskmanager.controller;

import org.springframework.web.bind.annotation.*;
import study.springtaskmanager.entity.Task;
import study.springtaskmanager.service.TaskService;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    private final TaskService taskService;
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping
    public void createTask(@RequestBody Task task) {
        taskService.addTask(task);
    }

    @GetMapping("/by_date")
    public List<Task> getTasksByDate(@RequestParam LocalDate date) {
        return taskService.getTasksByDate(date);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable long id) {
        taskService.deleteTask(id);
    }
}
