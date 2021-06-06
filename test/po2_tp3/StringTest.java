package po2_tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTest {
	String a = "abc";
	String s = a;
	String t;
	
	int varIntInstancia;
	Integer varIntegerInstancia;
	
	@Test
	void Str1() {
		assertEquals(s.length(), 3);	
	}

	@Test
	void Str2() {
		assertThrows(NullPointerException.class, () -> {t.length();});	
	}
	
	@Test
	void Str3() {
		assertEquals(1 + a, "1abc");	
	}
	
	@Test
	void Str4() {
		assertEquals(a.toUpperCase(), "ABC");	
	}
	
	@Test
	void Str5() {
		assertEquals("Libertad".indexOf("r"), 4);	
	}
	
	@Test
	void Str6() {
		assertEquals("Universidad".lastIndexOf('i'), 7);	
	}
	
	@Test
	void Str7() {
		assertEquals("Quilmes".substring(2,4), "il");	
	}
	
	@Test
	void Str8() {
		assertFalse((a.length() + a).startsWith("a"));	
	}
	
	@Test
	void Str9() {
		assertTrue(s == a);	
	}

	@Test
	void Str10() {
		assertTrue(a.substring(1,3).equals("bc"));	
	}
	
	@Test
	void variblaInstanicaVSMetodo() {
		int varIntMetodo = 0;
		Integer varIntegerMetodo = 0;
		
		System.out.println("varIntInstancia:" + this.varIntInstancia);
		System.out.println("varIntegerInstancia:" + this.varIntegerInstancia);
		System.out.println("varIntMetodo:" + varIntMetodo);
		System.out.println("varIntegerMetodo:" + varIntegerMetodo);
	}
}