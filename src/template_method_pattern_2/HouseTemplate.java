package template_method_pattern_2;

public abstract class HouseTemplate {
	// final �������� override ����
	public final void buildHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("Building house is complete!");
	}
	
	// �⺻���� ����
	public void buildWindows() {
		System.out.println("Building Glass Windows");
	}
	
	// ����Ŭ�������� ����
	public abstract void buildWalls();
	public abstract void buildPillars();
	
	
	private void buildFoundation() {
		System.out.println("Building foundation with cement, iron rods and sand");
	}
	
}
