package kr.co.soldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.soldesk.beans.TestBean1;
import kr.co.soldesk.beans.TestBean2;
import kr.co.soldesk.beans.TestBean3;
import kr.co.soldesk.beans.TestBean4;

public class MainClass1 {

	public static void main(String[] args) {

		// #1
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/soldesk/config/beans1.xml");
		// #2
		TestBean1 t1 = ctx.getBean("t1", TestBean1.class);
		System.out.printf("t1 : %s\n", t1);
		System.out.println("===============================================");
		
		//#3
		TestBean2 t2 = ctx.getBean("t2", TestBean2.class);
		System.out.printf("t2 : %s\n", t2);
		System.out.println("===============================================");

		//#4
		TestBean3 t3 = ctx.getBean("t3", TestBean3.class);
		System.out.printf("t3 : %s\n", t3);
		System.out.println("===============================================");
		
		//#5
		TestBean4 t4 = ctx.getBean("t4", TestBean4.class);
		System.out.printf("t4 : %s\n", t4);
		System.out.println("===============================================");
		
		//IOC 컨제이너 종료
		ctx.close();
	}

}
