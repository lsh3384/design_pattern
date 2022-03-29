package strategy_pattern_1;

public class StrategyGun implements Strategy {
	@Override
	public void runStrategy() {
		System.out.println("사격개시! 탕! 타당!");
	}
}
