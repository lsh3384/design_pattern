package strategy_pattern_1;

public class Soldier {
	
	void runContext(Strategy strategy) {
		System.out.println("���� ����!");
		strategy.runStrategy();
		System.out.println("���� ��!");
	}
	
}
