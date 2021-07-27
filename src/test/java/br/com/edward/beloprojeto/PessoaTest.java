package br.com.edward.beloprojeto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class PessoaTest {

	@Test
	public void getIdadeTest() {
		Pessoa p = new Pessoa(LocalDate.of(2020, 7, 25));
		assertEquals(p.getIdade(), 1);
	}
}
