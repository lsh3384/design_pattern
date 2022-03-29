package proxy_pattern;

public class Proxy implements IService {
	IService service1;
	
	@Override
	public String runSomething() {
		System.out.println("호출 흐름 제어, 반환값은 그대로");
		service1 = new Service();
		return service1.runSomething();
	}
}