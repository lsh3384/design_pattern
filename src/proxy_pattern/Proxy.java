package proxy_pattern;

public class Proxy implements IService {
	IService service1;
	
	@Override
	public String runSomething() {
		System.out.println("ȣ�� �帧 ����, ��ȯ���� �״��");
		service1 = new Service();
		return service1.runSomething();
	}
}