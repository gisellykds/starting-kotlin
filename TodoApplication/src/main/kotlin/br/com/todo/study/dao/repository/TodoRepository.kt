package br.com.todo.study.dao.repository

import br.com.todo.study.dao.entities.TodoEntity
import br.com.todo.study.domain.enums.StatusEnum
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import javax.transaction.Transactional

@Repository
interface TodoRepository : JpaRepository<TodoEntity, Long>{

    @Modifying
    @Transactional
    @Query("update TodoEntity AS t SET t.status = :status WHERE t.id = :id")
    fun updateStatusById(id: Long, status: StatusEnum)

}