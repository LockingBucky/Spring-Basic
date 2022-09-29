package kr.co.soldesk.beans;

public class SonySpeaker {
	
	public SonySpeaker() {
		System.out.println("=====> SonySpeaker 객체 생성");
	}
	
	public void volumeUp() {
		System.out.println("=====> SonySpeaker 소리 올리기");
	}
	
    public void volumeDown() {
		System.out.println("=====> SonySpeaker 소리 내리기");
	}
}
