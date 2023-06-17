package com.app1.app2.repository

import com.app1.app2.model.Task
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TaskRepository extends JpaRepository<Task, Integer> {

  List<Task> findAll()

  Task findById(Integer id)

  Task save(Task task)
}