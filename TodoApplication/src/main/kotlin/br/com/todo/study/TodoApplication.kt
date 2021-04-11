package br.com.todo.study

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@Configuration
@EnableJpaRepositories(basePackages = ["br.com.todo.study.dao.repository"])
@EntityScan(basePackages = ["br.com.todo.study.dao.entities"])
open class TodoApplication

fun main() {
    runApplication<TodoApplication>()
}

