package template_method_pattern_1;

public class ManualOperationCar extends Car{
	@Override
	void play() {
		System.out.println("Ŭ��ġ ��� 2�� �ֱ�");
		System.out.println("���� ��� ����");
	}
	
	@Override
	void runSomething() {
		System.out.println("�극��ũ ��� �ӵ� �������� Ŭ��ġ ��� ������� ");
	}
}
