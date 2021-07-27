package br.com.edward.beloprojeto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OvoTest {

	@Test
	public void getStatusCruTest() {
		Ovo ovo = new Ovo(10);
		ovo.quebrar();
		for (int i = 0; i < 250; i++) {
			ovo.fritar();
		}
		assertEquals(EnumStatusOvo.CRU, ovo.getStatus());
	}
	
	@Test
	public void getStatusMeioFritoTest() {
		Ovo ovo = new Ovo(10);
		ovo.quebrar();
		for (int i = 0; i < 500; i++) {
			ovo.fritar();
		}
		assertEquals(EnumStatusOvo.MEIOFRITO, ovo.getStatus());
	}
	
	@Test
	public void getStatusDeliciaTest() {
		Ovo ovo = new Ovo(10);
		ovo.quebrar();
		for (int i = 0; i < 750; i++) {
			ovo.fritar();
		}
		assertEquals(EnumStatusOvo.DELICIA, ovo.getStatus());
	}
	
	@Test
	public void getStatusMeioQueimadoTest() {
		Ovo ovo = new Ovo(10);
		ovo.quebrar();
		for (int i = 0; i < 1000; i++) {
			ovo.fritar();
		}
		assertEquals(EnumStatusOvo.MEIOQUEIMADO, ovo.getStatus());
	}
	
	@Test
	public void getStatusQueimadoTest() {
		Ovo ovo = new Ovo(10);
		ovo.quebrar();
		for (int i = 0; i < 1250; i++) {
			ovo.fritar();
		}
		assertEquals(EnumStatusOvo.QUEIMADO, ovo.getStatus());
	}
	
	@Test
	public void getStatusQuebrado() {
		Ovo ovo = new Ovo(10);
		ovo.quebrar();
		assertEquals(EnumStatusOvo.QUEBRADO, ovo.getStatus());
	}
}
