package kurs24;

public class IndexArrays {
	


	public static String[] getTypes() {
		return types;
	}

	public static String[] getSizes() {
		return sizes;
	}

	public static String[] getMaterials() {
		return materials;
	}

	public static String[] getCategories() {
		return categories;
	}

	public static String[] getFillers() {
		return fillers;
	}

	public static String[] getDeliveries() {
		return deliveries;
	}
	
	public static String[] types = new String[4];
	public static String [] sizes = new String[4];
	public static String [] materials = new String[4];
	public static String [] categories = new String[4];
	public static String [] fillers = new String[4];
	public static String [] deliveries = new String[4];
	
	
	public static void setValues() {
	types[0]="Банкетка";
	types[1]="Диван";
	types[2]="Кресло";
	types[3]="Стул";
	
	sizes[0]="Маленький";
	sizes[1]="Средний";
	sizes[2]="Большой";
	
	materials[0]="Ткань";
	materials[1]="Экокожа";
	materials[2]="Натуральная кожа";
	materials[3]="Кожзам";
	
	categories[0]="Низшая";
	categories[1]="Средняя";
	categories[2]="Высшая";
	
	fillers[0]="ППУ";
	fillers[1]="ЛППУ";
	
	deliveries[0]="По Уфе";
	deliveries[1]="По республике";
	deliveries[2]="Самовывоз";
	}
	
	
	
}
