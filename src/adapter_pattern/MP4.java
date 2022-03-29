package adapter_pattern;

public class MP4 implements MediaPackage {
	@Override
	public void playFile(String filename) {
		System.out.println("Playing MP4 File " + filename);
	}
}
