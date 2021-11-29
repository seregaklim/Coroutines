package ru.netology.coroutines.dto

data class PostWithAuthorsAndComments(
    val post: Post,
    val authorId: Author,
    val id: Long,
    val author: Author,
    )

