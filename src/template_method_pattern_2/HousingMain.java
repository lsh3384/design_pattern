package template_method_pattern_2;

public class HousingMain {
	public static void main(String[] args) {
		// ���ø� �޼ҵ� ���
		HouseTemplate houseType = new WoodenHouse();
		
		houseType.buildHouse();
		
		// ���м� ����
		System.out.println("\n------------------------\n");
		houseType = new GlassHouse();
		
		houseType.buildHouse();
	}
}
