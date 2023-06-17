package com.app1.app2.controller
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod


@RestController
class IndexController {

  @RequestMapping('/')
  String index() {
    'We in the house...'
  }
}
