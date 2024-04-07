package com.lnight.appsearchtodolist

data class TodoListState(
    val todos: List<Todo> = emptyList(),
    val searchQuery: String = ""
)
