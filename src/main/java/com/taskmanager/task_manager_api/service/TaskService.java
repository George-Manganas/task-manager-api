package com.taskmanager.task_manager_api.service;

import com.taskmanager.task_manager_api.model.Task;
import com.taskmanager.task_manager_api.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    // Constructor injection
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    // Get all tasks
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // Get task by id
    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    // Create or update task
    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    // Delete task by id
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}