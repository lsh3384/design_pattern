package template_method_pattern_1;

public class AutomaticOperationCar extends Car{
	@Override
	void play() {
		System.out.println("Drive D에 기어 놓기");
		System.out.println("자동 기어 변속");
	}
	
	@Override
	void runSomething() {
		System.out.println("부드럽게 브레이크");
	}
}
