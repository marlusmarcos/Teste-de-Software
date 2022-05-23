package edu.ldj.planner.task.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ldj.planner.task.EasyDate;

public class testeEasyDate {

	EasyDate _easy = new EasyDate();
	@Test
	public void testConstrutor1() {
		EasyDate easy = new EasyDate();
		assertEquals(easy.getDay(), 23);
		assertEquals(easy.getMonth(), 5);
		assertEquals(easy.getYear(),2022 );
	}
	@Test
	public void testConstrutor2() {
		EasyDate easy = new EasyDate(2110,4,10);
		assertEquals(easy.getDay(), 10);
		assertEquals(easy.getMonth(), 4);
		assertEquals(easy.getYear(),2110 );
		EasyDate easy2 = new EasyDate(2020,4,10);
		assertEquals(easy2.getDay(), 10);
		assertEquals(easy2.getMonth(), 4);
		assertEquals(easy2.getYear(),2020 );
	}
	
	@Test (expected =  IllegalArgumentException.class)
	public void testMesIllegalArgumentException () {
		EasyDate easy = new EasyDate(2110,0,10);
		
		assertEquals(easy.getMonth(), 10);
		assertEquals(easy.getYear(),2110 );
		
	}
	@Test (expected =  IllegalArgumentException.class)
	public void testDiaIllegalArgumentException () {
		EasyDate easy = new EasyDate(2110,1,0);
		assertEquals(easy.getMonth(), 10);
		assertEquals(easy.getYear(),2110 );
		
	}
	
	@Test
	public void testMonthDays ()  {
		_easy.setMonth(1);
		assertEquals(31, _easy.getMonthDays());
		_easy.setMonth(4);
		assertEquals(30, _easy.getMonthDays());
		_easy.setMonth(2);
		assertEquals(28, _easy.getMonthDays());
		_easy.setYear(2020);
		assertEquals(29, _easy.getMonthDays());
	}
	@Test
	public void testAddDays () {
		EasyDate date_atual = new EasyDate();
		date_atual.addDays(1);
		assertEquals(date_atual.getDay(), 24);
		date_atual.addDays(8);
		assertEquals(date_atual.getDay(), 1);
		assertEquals(date_atual.getMonth(), 6);
		date_atual.addDays(214);
		assertEquals(date_atual.getDay(), 1);
		assertEquals(date_atual.getMonth(), 1);
		assertEquals(date_atual.getYear(), 2023);
		
	}
	
	@Test
	public void testToString () {
		EasyDate date = new EasyDate();
		assertEquals("5/23/2022", date.toString());
	}
 
}
