package java08_abstract;

public class Main1 extends Player {
	public static void main(String[] args) {

		Main1 main = new Main1();
		main.play("검정치마 - EVERYTHING");
		main.pause();
		main.stop();
	}
	@Override
	void play(String songName) {
		System.out.println(songName + "곡을 재생합니다.");
	}

	@Override
	void stop() {
		System.out.println("곡을 정지합니다.");
	}
	@Override
	void pause() {
		
		
	}


		
	}

