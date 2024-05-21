package _04_interface;
/*
// interface
   		- 상속받을때 키워드는 implements를 사용
		- 다중상속 가능 ,로 구분 ex) implements RemoteControl, aaa, bbb


*/
public class Tv implements RemoteControl { 
		private int volume;
	@Override
	public void turnOn() {
		System.out.println("Tv를 켭니다");

	}

	@Override
	public void turnOff() {
		System.out.println("Tv를 끕니다");

	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME)//사용자가 입력한 볼륨값이 멕스볼륨보다 크다면 멕스볼륨값으로 고정
			this.volume = RemoteControl.MAX_VOLUME;
		else if(volume < RemoteControl.MIN_VOLUME) //사용자의 볼륨입력값이 민볼륨보다 낮다면 민볼륨값으로 고정
			this.volume = RemoteControl.MIN_VOLUME;
		System.out.println("현재 음량 : "+this.volume);//그냥 volume하면 사용자의 입력값이 출력되어 제대로된값이 안나오므로 this.volume으로 인스턴스변수지정해준다
	}

}
