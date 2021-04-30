package br.com.livros.controller

import br.com.livros.model.Livros
import br.com.livros.service.LivrosService
import io.micronaut.http.HttpRequest
import io.micronaut.http.MediaType
import io.micronaut.http.client.RxHttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.math.BigDecimal
import javax.inject.Inject

@MicronautTest
class LivrosControllerTest {
    @InjectMockKs
    lateinit var livrosController: LivrosController

    @MockK
    lateinit var livrosService: LivrosService
    lateinit var livros: Livros

    @BeforeEach
    fun setUp() {
        MockKAnnotations.init(this)
        livros = Livros(1L,"descricao","autor","nome",1.0)
    }
    @Test
    fun `request books with success`() {
        every { livrosService.create(any()) } returns livros
        val result = livrosController.salvaLivros(livros)
        Assertions.assertEquals(livros,result.body())
    }

}