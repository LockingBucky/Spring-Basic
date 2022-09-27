package kr.co.soldesk.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import kr.co.soldesk.beans.TestBean;

public class MainClassTest2 {

	public static void main(String[] args) {

		// #1
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/soldesk/config/beansTest2.xml");

		// #2
		TestBean t1 = ctx.getBean("test1", TestBean.class);
		System.out.printf("t1 : %s\n", t1);

		TestBean t2 = ctx.getBean("test1", TestBean.class);
		System.out.printf("t2 : %s\n", t2);
		// =====================================================

		// #3
		TestBean t3 = ctx.getBean("test2", TestBean.class);
		System.out.printf("t3 : %s\n", t3);

		// #4
		TestBean t4 = ctx.getBean("test2", TestBean.class);
		System.out.printf("t4 : %s\n", t4);

		// #5
		TestBean t5 = ctx.getBean("test3", TestBean.class);
		System.out.printf("t5 : %s\n", t5);

		// #6
		TestBean t6 = ctx.getBean("test3", TestBean.class);
		System.out.printf("t6 : %s\n", t6);

		//IOC 컨제이너 종료
		ctx.close();
	}

}
