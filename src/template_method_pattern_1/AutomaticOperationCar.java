package template_method_pattern_1;

public class AutomaticOperationCar extends Car{
	@Override
	void play() {
		System.out.println("Drive D�� ��� ����");
		System.out.println("�ڵ� ��� ����");
	}
	
	@Override
	void runSomething() {
		System.out.println("�ε巴�� �극��ũ");
	}
}
