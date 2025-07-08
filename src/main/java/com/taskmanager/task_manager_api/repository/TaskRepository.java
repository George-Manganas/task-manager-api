package com.taskmanager.task_manager_api.repository;

import com.taskmanager.task_manager_api.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Task entities.
 * Extends JpaRepository to provide built-in CRUD operations.
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    // No need to define any methods here unless you need custom queries.
    // JpaRepository provides methods like save(), findById(), findAll(), deleteById(), etc.
}
