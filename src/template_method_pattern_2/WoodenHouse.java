package template_method_pattern_2;

public class WoodenHouse extends HouseTemplate {
	@Override
	public void buildWalls() {
		System.out.println("Building Wood Walls");
	}
	
	@Override
	public void buildPillars() {
		System.out.println("Building Pillars with Wood Coating");
	}
}
