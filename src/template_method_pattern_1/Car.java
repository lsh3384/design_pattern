package template_method_pattern_1;

public abstract class Car {
	// ���ø� �޼���
	public void playWithOwner() {
		System.out.println("�õ� �ѱ�");
		System.out.println("���̵� �극��ũ ����");
		
		play();
		runSomething();
	}
	
	// �߻� �޼���
	abstract void play();
	
	// �Ϲ� �޼���
	void runSomething() {
		System.out.println("�극��ũ");
	}
}
