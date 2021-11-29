package ru.netology.coroutines.dto

data class CommentsWithAuthors(
    val author: Author,
    val comments: List<Comment>,
    )

