package decorator_pattern;

public class NormalCar extends CarDecorator {
	public NormalCar(Car c) {
		super(c);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding features of Normal Car.");
	}
	
	
}
