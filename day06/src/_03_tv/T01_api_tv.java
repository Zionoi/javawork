package _03_tv;

public class T01_api_tv {
	
	//속성 6개
	String company = "LG";
	String model = "울트라 FULL HD";
	int inch = 65;
	int volume; //int는 값설정 안하면 0이 기본값
	int channel = 1;
	boolean power; //boolean의 기본값은 false
	
	
	//메소드 4개
	void power( ) {
		power = !power;
		if(power)
			System.out.println("tv를 켭니다");
		else
			System.out.println("tv를 끕니다");
	}
	
	int channelup() {
		channel++;// channelup을 호출하면 1증가
		return channel; // 채널로 리턴
	}
	int channeldown() {
		channel--;
		return channel;
	}
	int volume(int volumeInput) {
		volume = volumeInput;
		return volume;
	}
	
	
	
	
	
	
}
