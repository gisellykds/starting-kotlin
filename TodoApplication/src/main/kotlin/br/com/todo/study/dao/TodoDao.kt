package br.com.todo.study.dao

import br.com.todo.study.dao.entities.TodoEntity
import br.com.todo.study.domain.enums.StatusEnum
import br.com.todo.study.domain.model.Todo

interface TodoDao {
    fun create(todo: Todo): TodoEntity
    fun getAll(): List<TodoEntity>
    fun getById(id: Long): TodoEntity
    fun updateStatus(id: Long, status: StatusEnum)
}