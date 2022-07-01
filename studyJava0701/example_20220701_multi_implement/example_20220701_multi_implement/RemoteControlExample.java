package example_20220701_multi_implement;

public class RemoteControlExample {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		Searchable searchable = tv;
		RemoteControl ad = new Audio();

		rc.turnOn();
		rc.turnOff();
		rc.setVolume(20);
		// rc.search("네이버");		사용 못함
		// rc.changeBattery();		사용 못함
		rc.setMute(true);
		rc.setMute(false);
		System.out.println("rc.MAX_VOLUME: " + rc.MAX_VOLUME);
		System.out.println("----------------------RemoteControl 끝------------------");


		searchable.search("네이버");
		// searchable.turnOn(); 작동 안됨
		System.out.println("----------------------Searchable 끝------------------");

		tv.turnOn();
		tv.turnOff();
		tv.setVolume(20);	/* 상속을 자동으로 받지 않음 */
		tv.search("네이버");
		System.out.println("----------------------tv 끝------------------");

		ad.turnOn();
		ad.turnOff();
		ad.setVolume(15);
		ad.setMute(true);
	}
}
