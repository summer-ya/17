package java08_abstract;

public class Main1 extends Player {
	public static void main(String[] args) {

		Main1 main = new Main1();
		main.play("����ġ�� - EVERYTHING");
		main.pause();
		main.stop();
	}
	@Override
	void play(String songName) {
		System.out.println(songName + "���� ����մϴ�.");
	}

	@Override
	void stop() {
		System.out.println("���� �����մϴ�.");
	}
	@Override
	void pause() {
		
		
	}


		
	}

