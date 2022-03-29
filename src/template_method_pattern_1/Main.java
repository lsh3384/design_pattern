package template_method_pattern_1;

public class Main {

	public static void main(String[] args) {
		Car truck = new ManualOperationCar();
		Car benz = new AutomaticOperationCar();
		
		truck.playWithOwner();
		
		System.out.println("\n\n");
		
		benz.playWithOwner();
	}

}
