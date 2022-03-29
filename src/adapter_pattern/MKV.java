package adapter_pattern;

public class MKV implements MediaPackage {
	@Override
	public void playFile(String filename) {
		System.out.println("Play MKV File " + filename);
	}
}
