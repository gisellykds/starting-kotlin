package br.com.todo.study.dao.entities

import br.com.todo.study.domain.enums.StatusEnum
import javax.persistence.*

@Entity
@Table(name = "todo_td")
class TodoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long?

    @Column(nullable = false)
    val description: String?

    @Column(nullable = false)
    val status: StatusEnum?

    constructor(description: String) {
        this.description = description
        this.status = StatusEnum.TO_DO
        this.id = null
    }

    constructor(){
      this.id= null
      this.description= null
      this.status= null
    }

}