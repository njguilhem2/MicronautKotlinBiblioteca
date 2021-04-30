package br.com.livros.utils

import br.com.livros.model.Livros
import br.com.livros.model.handler.LivrosException

class LivrosUtils {
    companion object{
        fun nomeValid(livros: Livros): Livros{
            if(livros.nome.isNullOrEmpty()) {
                throw LivrosException()
            }
            return livros
        }
    }
}