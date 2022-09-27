package kr.co.soldesk.beans;

public class SoldeskTV implements TV {

	public SoldeskTV() {
		System.out.println("=====> SoldeskTV 객체 생성");
	}

	public void powerOn() {
		System.out.println("SoldeskTV --- 전원을 켠다");

	}

	public void powerOff() {
		System.out.println("SoldeskTV --- 전원을 끈다");

	}

	public void VolumeUp() {
		System.out.println("SoldeskTV --- 볼륨 업");

	}

	public void VolumeDown() {
		System.out.println("SoldeskTV --- 볼륨 다운");

	}

}
