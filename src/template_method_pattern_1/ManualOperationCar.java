package template_method_pattern_1;

public class ManualOperationCar extends Car{
	@Override
	void play() {
		System.out.println("클러치 밟고 2단 넣기");
		System.out.println("수동 기어 조작");
	}
	
	@Override
	void runSomething() {
		System.out.println("브레이크 밟고 속도 떨어지면 클러치 밟고 기어조작 ");
	}
}
