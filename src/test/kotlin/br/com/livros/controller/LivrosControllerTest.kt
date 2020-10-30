package br.com.livros.controller

import br.com.livros.model.Livros
import io.micronaut.http.HttpRequest
import io.micronaut.http.MediaType
import io.micronaut.http.client.RxHttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import javax.inject.Inject

@MicronautTest
class LivrosControllerTest {

    @Inject
    @field:Client("/")
    lateinit var client: RxHttpClient

    @Test
    fun testController() {
        var request= HttpRequest.GET<Any>("/livros/")
        var result = client.toBlocking().retrieve(request,List::class.java)
        Assertions.assertNotNull(result)
    }
    @Test
    fun testControllerPost(){
        var request = HttpRequest.POST<Any>("/livros",
                """{"nome":"allan walker","autor":"niltu","valor":5.2,"descricao":"dasdasdas"}""")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
        var result = client.toBlocking().retrieve(request, Livros::class.java)
        Assertions.assertNotNull(result)
    }
}