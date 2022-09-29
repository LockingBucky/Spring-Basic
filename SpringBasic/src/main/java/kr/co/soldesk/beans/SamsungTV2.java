package kr.co.soldesk.beans;

public class SamsungTV2 implements TV{
	
	private SonySpeaker speaker;
	private int price;

	public SamsungTV2() {
		System.out.println("=====> SamsungTV2 객체 생성");
	}
	
	public SamsungTV2(SonySpeaker speaker) {
		System.out.println("=====> SonySpeaker 객체 생성");
		this.speaker = speaker;
	}

	public SamsungTV2(SonySpeaker speaker, int price) {
		System.out.println("=====> SonySpeaker 객체 생성");
		this.speaker = speaker;
		this.price = price;
	}
	
	
	public void powerOn() {
		System.out.println("SamsungTV2 --- 전원 On");
		System.out.println("가격 : "+price);
	}
	public void powerOff() {
		System.out.println("SamsungTV2 --- 전원 Off");	
	}
	public void VolumeUp() {
		speaker.volumeUp();
	}
	public void VolumeDown() {
		speaker.volumeDown();
	}

}
