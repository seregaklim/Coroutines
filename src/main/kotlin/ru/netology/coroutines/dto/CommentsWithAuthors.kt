package ru.netology.coroutines.dto

data class CommentsWithAuthors(
    val post: Comment,
    val comments: List<Author>,
    )

