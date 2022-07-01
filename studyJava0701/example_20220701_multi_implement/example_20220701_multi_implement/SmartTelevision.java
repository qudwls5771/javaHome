package example_20220701_multi_implement;

import java.util.concurrent.TimeUnit;

public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;
	private int channels;
	private int turn_T;
	
	public void turnOn() {
		System.out.println("티비가 켜졌습니다.");
	}	
	public void turnOff() {
		System.out.println("티비가 꺼졌습니다.");
	}
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("볼륨 : " + this.volume);
	}
	
	public void search(String url) {
		System.out.println(url + "을 찾습니다.");
	}
	
	//1.
	public void channel(int channels) {
		int[] tv_channel ={10, 20, 25, 120};
		// 찾을값 
		int target = channels; 
		// 가까운값을 저장할 변수
		int near = 0;  
		//차이값의 절대값의 최소값을 저장할 변수, 초기값은 정수형에서 최대값
		int min = Integer.MAX_VALUE; 

		for(int i = 0; i< tv_channel.length; i++){
			int x = Math.abs(tv_channel[i] - target);
			if(min > x){
				min = x;
				near = tv_channel[i];
			}
		}
		System.out.println(target + " 입력하셨습니다." + near);
	}


	//2.
	@Override // 리모컨
	public void turn(int turn_T) {
			try{
				for(int i = 0; i<10; i++){
					TimeUnit.SECONDS.sleep(2);
					System.out.println("실행시간 : " + i);
				}	
			}catch(Exception e){
				System.out.println(e);
	
			}		
	}


	public void changeCH(RemoteControl rt){
		rt.turn(3);
		rt.channel(5);

	}

	public void changeCH_1(RemoteControl rt){
		rt.turn(5);
		rt.channel(5);

	}

	public void changeCH_2(RemoteControl rt){
		rt.turn(10);
		rt.channel(5);

	}


	public static void main(String[] args){
		SmartTelevision st = new SmartTelevision();
		st.channel(16);
		
		//st.changeCH(st);
		//st.changeCH_1(st);
		//st.changeCH_2(st);

		
	}
	//인터페이스는 추상적 메소드이기 때문에 자식은 무조건 부모의 메소드를 선언해야한다.
	//인터페이스는 abst어쩌고가 없어도 선언되어야 한다.
	//상속도 비슷하지만 abst어쩌고가 있으면 자식이 무조건 써야된다.
	//상속은 부모1 - 자식의 관계가 있다면 무조건 부모1에서만 상속을 받을 수 있다.
		
	
	
	//인터랑 상속의 가장 큰 차이점은 다중상속입니다.
	//상속은 1대1 인터는 implements를 쓰면 다 됩니다.




}