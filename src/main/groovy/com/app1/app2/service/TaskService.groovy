package com.app1.app2.service

import com.app1.app2.model.Task

interface TaskService {

  List<Task> findAll()

  Task findById(int id)

  Task saveTask(Task task)
}