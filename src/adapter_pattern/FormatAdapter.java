package adapter_pattern;

public class FormatAdapter implements MediaPlayer {
	MediaPackage media;
	
	public FormatAdapter(MediaPackage m) {
		this.media = m;
	}
	
	@Override
	public void play(String filename) {
		System.out.println("Using Adater --> ");
		media.playFile(filename);
	}
}
