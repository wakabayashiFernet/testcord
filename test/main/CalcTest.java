package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//	}
//
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//	}
//
//	@Before
//	public void setUp() throws Exception {
//	}
//
//	@After
//	public void tearDown() throws Exception {
//	}

	@Test
	public void addで加算処理ができる() {
		Calc calc = new Calc();
		int result = calc.add(2, 4);
		assertEquals(6, result);
	}
	@Test
	public void addで加算処理ができる２() {
		Calc calc = new Calc();
		int result = calc.add(3, 5);
		assertEquals(8, result);
	}
	@Test
	public void decで減算処理ができる２() {
		Calc calc = new Calc();
		int result = calc.dec(5, 5);
		assertEquals(0, result);
	}
	@Test
	public void divで除算処理ができる1() {
		Calc calc = new Calc();
		int result = calc.div(5, 0);
		assertEquals(0, result);
	}
	@Test
	public void divで除算処理ができる2() {
		Calc calc = new Calc();
		int result = calc.div(5, 5);
		assertEquals(1, result);
	}

}
