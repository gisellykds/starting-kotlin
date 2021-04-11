package br.com.todo.study.domain.model

import com.fasterxml.jackson.annotation.JsonProperty

class Todo(
    @JsonProperty("description")
    val description: String
)