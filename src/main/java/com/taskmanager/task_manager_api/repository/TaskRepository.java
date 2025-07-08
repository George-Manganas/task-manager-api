package com.taskmanager.task_manager_api.repository;

import com.taskmanager.task_manager_api.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    // JpaRepository provides basic CRUD methods by default
}