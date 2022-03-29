package strategy_pattern_1;

public class Soldier {
	
	void runContext(Strategy strategy) {
		System.out.println("게임 시작!");
		strategy.runStrategy();
		System.out.println("게임 끝!");
	}
	
}
