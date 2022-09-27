package kr.co.soldesk.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import kr.co.soldesk.beans.TestBean;

public class MainClassTest {

	public static void main(String[] args) {

	    //test1(); //내부
		//test2(); // 외부
		//test3();
		test4();

	}

	public static void test1() {
		// 경로지정 객체
		ClassPathResource res = new ClassPathResource("kr/co/soldesk/config/beansTest.xml");
		// 객체 생성
		XmlBeanFactory factory = new XmlBeanFactory(res);

		TestBean t1 = factory.getBean("t1", TestBean.class);
		System.out.println("t1 : " + t1);

		TestBean t2 = factory.getBean("t2", TestBean.class);
		System.out.println("t2 : " + t2);

	}

	public static void test2() {
		// 외부 패키지
		FileSystemResource res = new FileSystemResource("beansTest.xml");
		// 객체 생성
		XmlBeanFactory factory = new XmlBeanFactory(res);

		TestBean t1 = factory.getBean("t1", TestBean.class);
		System.out.println("t1 : " + t1);

		TestBean t2 = factory.getBean("t2", TestBean.class);
		System.out.println("t2 : " + t2);

	}

	public static void test3() {
		//내부 beans의 경로 호출시 객체가 자동 생성
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/soldesk/config/beansTest.xml");

		
		 TestBean t1 = ctx.getBean("t1", TestBean.class);
		 System.out.println("t1 : "+t1);
		 
		 TestBean t2 = ctx.getBean("t2", TestBean.class);
		 System.out.println("t2 : "+t2);
		 
		
		ctx.close();

	}
	
	public static void test4() {
		 //외부 beans의 경로 호출시 객체가 자동 생성
		 FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("beansTest.xml");

		 TestBean t1 = ctx.getBean("t1", TestBean.class);
		 System.out.println("t1 : "+t1);
		 
		 TestBean t2 = ctx.getBean("t2", TestBean.class);
		 System.out.println("t2 : "+t2);

		 ctx.close();

	}
	
}
