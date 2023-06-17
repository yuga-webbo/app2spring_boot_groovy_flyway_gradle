package com.app1.app2

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class App2Application {

	static void main(String[] args) {
		SpringApplication.run(App2Application, args)
		println("Server started...")
	}

}
