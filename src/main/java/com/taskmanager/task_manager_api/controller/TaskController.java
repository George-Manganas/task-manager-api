package com.taskmanager.task_manager_api.controller;

import com.taskmanager.task_manager_api.model.Task;
import com.taskmanager.task_manager_api.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * REST Controller that exposes endpoints for managing tasks.
 * Handles incoming HTTP requests and delegates business logic to TaskService.
 */
@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    /**
     * Constructor-based dependency injection of TaskService.
     *
     * @param taskService service layer for managing task operations
     */
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    /**
     * GET /api/tasks
     * Retrieves all tasks from the system.
     *
     * @return a list of all Task objects
     */
    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    /**
     * GET /api/tasks/{id}
     * Retrieves a task by its ID.
     *
     * @param id the ID of the task to retrieve
     * @return the task if found, or 404 if not
     */
    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id) {
        Optional<Task> task = taskService.getTaskById(id);
        return task.map(ResponseEntity::ok)
                   .orElseGet(() -> ResponseEntity.notFound().build());
    }

    /**
     * POST /api/tasks
     * Creates a new task.
     *
     * @param task the task data from the request body
     * @return the newly created task with HTTP 201 status
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Task createTask(@RequestBody Task task) {
        return taskService.saveTask(task);
    }

    /**
     * PUT /api/tasks/{id}
     * Updates an existing task by ID.
     *
     * @param id the ID of the task to update
     * @param taskDetails the new task data
     * @return the updated task if found, or 404 if not found
     */
    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task taskDetails) {
        Optional<Task> existingTask = taskService.getTaskById(id);

        if (!existingTask.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        Task task = existingTask.get();
        task.setTitle(taskDetails.getTitle());
        task.setDescription(taskDetails.getDescription());
        task.setCompleted(taskDetails.isCompleted());

        Task updatedTask = taskService.saveTask(task);
        return ResponseEntity.ok(updatedTask);
    }

    /**
     * DELETE /api/tasks/{id}
     * Deletes a task by its ID.
     *
     * @param id the ID of the task to delete
     */
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }
}
