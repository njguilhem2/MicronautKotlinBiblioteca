package br.com.livros.model.handler

data class LivrosError(
    val error: String = "",
    val code: Int = 0,
    val message: String = ""
)