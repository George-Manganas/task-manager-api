package com.taskmanager.task_manager_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point of the Task Manager API application.
 * Uses Spring Boot's auto-configuration to bootstrap the app.
 */
@SpringBootApplication
public class TaskManagerApiApplication {

    /**
     * Main method that launches the Spring Boot application.
     *
     * @param args command-line arguments (if any)
     */
    public static void main(String[] args) {
        SpringApplication.run(TaskManagerApiApplication.class, args);
    }
}
