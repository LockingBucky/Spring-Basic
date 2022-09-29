package kr.co.soldesk.beans;

public class SamsungTV3 implements TV{
	
	private SonySpeaker speaker;
	private int price;

	public SamsungTV3() {
		System.out.println("=====> SamsungTV3 객체 생성");
	}

	public SamsungTV3(SonySpeaker speaker, int price) {
		System.out.println("=====> SonySpeaker 객체 생성");
		this.speaker = speaker;
		this.price = price;
	}
	
	//--------------------------------------------------------
	public SonySpeaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(SonySpeaker speaker) {
		this.speaker = speaker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

	public void powerOn() {
		System.out.println("SamsungTV3 --- 전원 On");
		System.out.println("가격 : "+price);
	}
	public void powerOff() {
		System.out.println("SamsungTV3 --- 전원 Off");	
	}
	public void VolumeUp() {
		speaker.volumeUp();
	}
	public void VolumeDown() {
		speaker.volumeDown();
	}

}
