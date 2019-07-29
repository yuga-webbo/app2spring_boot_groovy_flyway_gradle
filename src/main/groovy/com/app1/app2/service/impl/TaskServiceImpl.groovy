package com.app1.app2.service.impl

import com.app1.app2.model.Task
import com.app1.app2.service.TaskService
import com.app1.app2.repository.TaskRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TaskServiceImpl implements TaskService {

  @Autowired
  private final TaskRepository taskRepository

  @Override
  List<Task> findAll() {
    taskRepository.findAll()
  }

  @Override
   Task findById(int id) {
    taskRepository.findById(id)
  }

  @Override
   Task saveTask(Task task) {
    taskRepository.save(task)
  }
}