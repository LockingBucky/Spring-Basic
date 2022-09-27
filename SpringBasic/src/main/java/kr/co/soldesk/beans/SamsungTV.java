package kr.co.soldesk.beans;

public class SamsungTV implements TV{

	public SamsungTV() {
		System.out.println("=====> SamsungTV 객체 생성");
	}
	public void powerOn() {
		System.out.println("SamsungTV --- 전원을 켠다");
	}
	public void powerOff() {
		System.out.println("SamsungTV --- 전원을 끈다");	
	}
	public void VolumeUp() {
		System.out.println("SamsungTV --- 볼륨 업");
	}
	public void VolumeDown() {
		System.out.println("SamsungTV --- 볼륨 다운");	
	}

}
