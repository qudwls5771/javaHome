package studyJava0701.example_20220701_multi_implement.example_20220701_multi_implement;

import java.util.ArrayList;

public interface RemoteControl {

	//실수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	void turn(int turn_T);
	int channel();
	void sunho();
	void Login();

	//default 메서드 (static x 인스턴스 없이 실행 불가 o)
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("음소거를 실행합니다.");
		} else {
			System.out.println("음소거를 취소합니다. ");
		}
	}
	//정적메서드 (인스턴스 없이 실행 x)
	static void changeBattery() {
		System.out.println(" 배터리가 변경되었습니다.");
	}
	
}
