package br.com.livros.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Livros(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0,
    val descricao: String = "",
    val autor: String = "",
    val nome: String = "",
    val valor: Double = 0.0,
)