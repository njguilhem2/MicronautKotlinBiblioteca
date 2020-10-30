package br.com.livros.model

import javax.persistence.*

@Entity
data class Livros(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    @Column
    val descricao: String,
    @Column
    val autor: String,
    @Column
    val nome: String,
    @Column
    val valor: Double,
){
    constructor(): this(null,"","","",0.0)

}