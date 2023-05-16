package mobile;

public class Iphone extends SmartPhone implements MediaPlayer, GPS {
	
	public void installApplication(String appName) {
		System.out.println(appName + " (Installed!)");
	}
	
	public String playSong(String songName) {
		return "Song: " + songName + " Now Playing!";
	}
	
	public String playVideo(String videoName) {
		return "Video: " + videoName + " Now Playing!";
	}
	
	public String getLocation() {
		return "15.23456, -30.67890";
	}
}