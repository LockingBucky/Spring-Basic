package kr.co.soldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.soldesk.beans.TestBean5;
import kr.co.soldesk.beans.TestBean6;

public class MainClass2 {

	public static void main(String[] args) {

		// #1
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/soldesk/config/beans2.xml");
		
		// #2
		TestBean5 t5 = ctx.getBean("t5", TestBean5.class);
		System.out.println("t5 :"+ t5);
		System.out.println("===============================================");
		
		// #2
		TestBean6 t6 = ctx.getBean("t6", TestBean6.class);
		System.out.println("t6 : "+ t6);
		System.out.println("===============================================");
		
		ctx.close();

	}

}
