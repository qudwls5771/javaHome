package example_20220701_multi_implement;

import java.util.ArrayList;

public class Audio implements RemoteControl {
    private int volume;

    public void turnOn(){
        System.out.println("Audio 전원이 꺼졌습니다.");
    };
	public void turnOff(){
        System.out.println("Audio 전원이 켜졌습니다.");

    };
	public void setVolume(int volume){
        
        if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("볼륨 : " + this.volume);

    }
	@Override
	public void turn(int turn_T) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int channel() {
		// TODO Auto-generated method stub
		int i = 0;

		return i;	
	}
	@Override
	public void sunho() {
		// TODO Auto-generated method stub
		
	}

}
