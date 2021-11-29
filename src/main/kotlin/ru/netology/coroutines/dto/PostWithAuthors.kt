package ru.netology.coroutines.dto

data class PostWithAuthors(
    val post:Post,
    val author: Author,
    val id: Long,
    val authorId: Long
)
