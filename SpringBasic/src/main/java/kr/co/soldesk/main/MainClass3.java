package kr.co.soldesk.main;

import java.util.ArrayList;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.soldesk.beans.DataBean;
import kr.co.soldesk.beans.SamsungTV2;
import kr.co.soldesk.beans.TV;
import kr.co.soldesk.beans.TestBean7;
import kr.co.soldesk.beans.TestBean8;

public class MainClass3 {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/soldesk/config/beans3.xml");

		// 기본 생성자
		TestBean7 t7 = new TestBean7();
		t7.printData();
		System.out.println("===============================================");
		// 기본생성자
		TestBean7 obj1 = ctx.getBean("obj1", TestBean7.class);
		obj1.printData();
		System.out.println("===============================================");

		// int형 1개
		TestBean7 t77 = new TestBean7(100);
		t77.printData();
		System.out.println("===============================================");
		// int형 1개
		TestBean7 obj2 = ctx.getBean("obj2", TestBean7.class);
		obj2.printData();
		System.out.println("===============================================");

		// double형 1개
		TestBean7 t777 = new TestBean7(11.11);
		t777.printData();
		System.out.println("===============================================");
		// double형 1개
		TestBean7 obj3 = ctx.getBean("obj3", TestBean7.class);
		obj3.printData();
		System.out.println("===============================================");

		// String형 1개
		TestBean7 t7777 = new TestBean7("화요일");
		t7777.printData();
		System.out.println("===============================================");
		// String형 1개
		TestBean7 obj4 = ctx.getBean("obj4", TestBean7.class);
		obj4.printData();
		System.out.println("===============================================");

		// int, double, String형 1개
		TestBean7 t77777 = new TestBean7(200, 22.22, "8교시");
		t77777.printData();
		System.out.println("===============================================");
		// int, double, String형 1개
		TestBean7 obj5 = ctx.getBean("obj5", TestBean7.class);
		obj5.printData();
		System.out.println("===============================================");

		// int, double, String형 1개 => 순서 무관
		TestBean7 obj6 = ctx.getBean("obj6", TestBean7.class);
		obj6.printData();
		System.out.println("===============================================");

		// int, double, String형 1개 => index 명시
		TestBean7 obj7 = ctx.getBean("obj7", TestBean7.class);
		obj7.printData();
		System.out.println("===============================================");
		
		System.out.println("# DataBean의 의존성 주입");
		DataBean d1 = new DataBean();
		DataBean d2 = new DataBean();
		TestBean8 t800 = new TestBean8(d1, d2);
		t800.printData();
		
		System.out.println("上에 있는것과 비교하면, 下의 경우 이미 생성된 객체 사용");
		TestBean8 obj8 = ctx.getBean("obj8", TestBean8.class);
		obj8.printData();
		
		System.out.println("# 이미 생성된 객체사용");
		System.out.println("===============================================");
		TestBean8 obj9 = ctx.getBean("obj9", TestBean8.class);
		obj9.printData();

		System.out.println("======================= TV활용 ==========================");
		
//		
//		TV tv = new SamsungTV2();
//		List<String> list = new ArrayList<String>();
//		List<String> list = new Vec<String>();
		
		TV tv = (TV) ctx.getBean("tv");
		tv.powerOn();
		tv.powerOff();
		tv.VolumeUp();
		tv.VolumeDown();
		
		
		ctx.close();

	}

}
