package com.app1.app2.controller

import com.app1.app2.model.Task


import com.app1.app2.service.TaskService
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping('/tasks')
class TasksController {

  @Autowired
  private final TaskService taskService

  @RequestMapping(method = RequestMethod.GET)
  List<Task> findAll() {
    taskService.findAll()
  }

  @RequestMapping(value = '/{id}', method = RequestMethod.GET)
  Task findById(@PathVariable('id') int id) {
    taskService.findById(id);
  }

 @PostMapping("/create")
  Task saveTask(@RequestBody Task task) {
    taskService.saveTask(task);
  }
}
