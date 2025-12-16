package Oops;

	class Audioplayer implements Playablee{
		@Override
		public void play() {
			System.out.println("Playing Audio File...");
		}
	}
	class Videoplayer implements Playablee{
		@Override
		public void play() {
			System.out.println("Playing Video File...");
		}
	}

public class MxPlayer {
	public static void main(String[] args) {
		Playablee[] p1= {new Audioplayer(), new Videoplayer()};
		for(Playablee p:p1) {
			p.play();
		}
	}

}
