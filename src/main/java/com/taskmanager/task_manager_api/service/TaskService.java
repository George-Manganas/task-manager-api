package com.taskmanager.task_manager_api.service;

import com.taskmanager.task_manager_api.model.Task;
import com.taskmanager.task_manager_api.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service layer class that handles business logic related to Task entities.
 * Acts as an intermediary between the controller and the repository.
 */
@Service
public class TaskService {

    /**
     * Repository interface for CRUD operations on Task entities.
     */
    private final TaskRepository taskRepository;

    /**
     * Constructor for TaskService with dependency injection of TaskRepository.
     *
     * @param taskRepository the repository instance to be used
     */
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    /**
     * Retrieves all Task entities from the database.
     *
     * @return a list of all tasks
     */
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    /**
     * Retrieves a Task by its unique ID.
     *
     * @param id the ID of the task to retrieve
     * @return an Optional containing the found Task, or empty if not found
     */
    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    /**
     * Creates a new Task or updates an existing one.
     *
     * @param task the Task entity to save
     * @return the saved Task entity with any updates applied
     */
    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    /**
     * Deletes a Task from the database by its ID.
     *
     * @param id the ID of the Task to delete
     */
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}
