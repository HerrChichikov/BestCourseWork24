package kurs24;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void test() {
		double a = (int) (Math.random()*18 + 4);
		double b = (int) (Math.random()*2900 + 100);
		double c = (int) (Math.random()*0.1 + 1.1);
		double d = (int) (Math.random()*1000);
		Double result = CalcSum.calculate(a, b, c, d);
		if (result == 0 ) {
		fail("Not yet implemented");
	}

}
}