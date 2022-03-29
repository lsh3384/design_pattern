package strategy_pattern_1;

public class Client {

	public static void main(String[] args) {
		Strategy strategy = null;
		Soldier rambo = new Soldier();
		
		strategy = new StrategyGun();
		
		rambo.runContext(strategy);
		
		strategy = new StrategyGrenade();
		rambo.runContext(strategy);
	}

}
