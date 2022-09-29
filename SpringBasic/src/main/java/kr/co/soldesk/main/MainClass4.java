package kr.co.soldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.soldesk.beans.SamsungTV3;
import kr.co.soldesk.beans.TestBean9;

public class MainClass4 {

	public static void main(String[] args) {
//		TestBean9 obj1 = new TestBean9();
//		obj1.setData1(100);
//		System.out.println("obj1.data1 :" + obj1.getData1());  //get
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/soldesk/config/beans4.xml");
		TestBean9 t9 = ctx.getBean("t9", TestBean9.class);
		System.out.println("t9.data1 : "+ t9.getData1());
		System.out.println("t9.data2 : "+ t9.getData2());
		System.out.println("t9.data3 : "+ t9.isData3());
		System.out.println("t9.data4 : "+ t9.getData4());
		System.out.println("t9.data5 : "+ t9.getData5());
		System.out.println("t9.data6 : "+ t9.getData6());
		
		SamsungTV3 stv = ctx.getBean("tv", SamsungTV3.class);
		stv.powerOn();
		stv.powerOff();
		stv.VolumeUp();
		stv.VolumeDown();
		System.out.println("===============================");
		stv.getSpeaker();
		stv.getPrice();
		
		ctx.close();
	}

}
