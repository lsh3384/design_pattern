package template_method_pattern_2;

public abstract class HouseTemplate {
	// final 선언으로 override 방지
	public final void buildHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("Building house is complete!");
	}
	
	// 기본으로 구현
	public void buildWindows() {
		System.out.println("Building Glass Windows");
	}
	
	// 서브클래스에서 구현
	public abstract void buildWalls();
	public abstract void buildPillars();
	
	
	private void buildFoundation() {
		System.out.println("Building foundation with cement, iron rods and sand");
	}
	
}
