package ru.netology.coroutines.dto

data class PostWithAuthors(
    val post: Post,
    val author: List<Author>,
    val id: Long,
    )
