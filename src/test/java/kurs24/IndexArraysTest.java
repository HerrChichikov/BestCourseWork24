package kurs24;

import static org.junit.Assert.*;

import org.junit.Test;

public class IndexArraysTest {

	@Test
	public void test() {
		IndexArrays.setValues();
		String [] types = IndexArrays.getTypes();
		String [] sizes = IndexArrays.getSizes();
		String [] materials = IndexArrays.getMaterials();
		String [] categories = IndexArrays.getCategories();
		String [] fillers = IndexArrays.getFillers();
		String [] deliveries = IndexArrays.getDeliveries();
		for (int i = 0; i < 2; i++) {
			if (types[i].isEmpty()) {
				fail("Значение пустое");
			}
			if (sizes[i].isEmpty()) {
				fail("Значение пустое");
			}
			if (materials[i].isEmpty()) {
				fail("Значение пустое");
			}
			if (categories[i].isEmpty()) {
				fail("Значение пустое");
			}
			if (fillers[i].isEmpty()) {
				fail("Значение пустое");
			}
			if (deliveries[i].isEmpty()) {
				fail("Значение пустое");
			}
		}
	}

}