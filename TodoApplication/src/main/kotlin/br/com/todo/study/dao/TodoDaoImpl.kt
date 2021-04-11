package br.com.todo.study.dao

import br.com.todo.study.dao.entities.TodoEntity
import br.com.todo.study.dao.repository.TodoRepository
import br.com.todo.study.domain.enums.StatusEnum
import br.com.todo.study.domain.model.Todo
import org.springframework.stereotype.Service

@Service
class TodoDaoImpl(private val todoRepository: TodoRepository) : TodoDao {

    override fun create(todo: Todo): TodoEntity {
        return todoRepository.save(TodoEntity(todo.description))
    }

    override fun getAll(): List<TodoEntity> {
        return todoRepository.findAll();
    }

    override fun getById(id: Long): TodoEntity {
        return verifyIfExists(id)
    }

    override fun updateStatus(id: Long, status: StatusEnum) {
        verifyIfExists(id);
        todoRepository.updateStatusById(id, status)
    }

    private fun verifyIfExists(id: Long): TodoEntity {
        val todoOptional = todoRepository.findById(id)
        if (!todoOptional.isPresent())
            throw Exception(String.format("Task: %s not found.", id));
        return todoOptional.get()
    }
}