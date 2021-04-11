package br.com.todo.study.controllers

import br.com.todo.study.dao.TodoDao
import br.com.todo.study.dao.entities.TodoEntity
import br.com.todo.study.domain.enums.StatusEnum
import br.com.todo.study.domain.model.Todo
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.URI

@RestController
@RequestMapping("/todo")
class TodoController(private val todoDao: TodoDao) {

    @PostMapping
    fun create(@RequestBody todo: Todo): ResponseEntity<TodoEntity>{
        val todoResponse = todoDao.create(todo)
        return ResponseEntity.created(URI.create("/todo/" + todoResponse.id)).body(todoResponse)
    }

    @GetMapping
    fun getAll(): ResponseEntity<List<TodoEntity>>{
        return ResponseEntity.ok(todoDao.getAll())
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): ResponseEntity<TodoEntity>{
        return ResponseEntity.ok(todoDao.getById(id))
    }

    @PatchMapping("/{id}")
    fun updateById(@PathVariable id: Long, @RequestParam status: StatusEnum): ResponseEntity<String>{
        todoDao.updateStatus(id, status)
        return ResponseEntity.ok(String.format("Task: %s moved to %s.", id, status))
    }
}