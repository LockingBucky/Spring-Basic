package kr.co.soldesk.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.soldesk.beans.TV;

public class TVUser {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("kr/co/soldesk/config/beans.xml");
		TV tv = (TV) ctx.getBean("tv1"); //SamsungTV
		tv.powerOn();
		tv.powerOff();
		tv.VolumeUp();
		tv.VolumeDown();
		
		//컨테이너를 종료
		ctx.close();
	}

}
