package template_method_pattern_2;

public class HousingMain {
	public static void main(String[] args) {
		// 템플릿 메소드 사용
		HouseTemplate houseType = new WoodenHouse();
		
		houseType.buildHouse();
		
		// 구분선 삽입
		System.out.println("\n------------------------\n");
		houseType = new GlassHouse();
		
		houseType.buildHouse();
	}
}
