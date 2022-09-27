package kr.co.soldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import kr.co.soldesk.beans.HelloWorld;

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/soldesk/config/beans.xml");
		
		HelloWorld hello1 = (HelloWorld) ctx.getBean("hello1");
		CallMethod(hello1);
		
		HelloWorld hello2 = (HelloWorld) ctx.getBean("hello2");
		CallMethod(hello2);
		
		ctx.close();
		
	}
	
	public static void CallMethod(HelloWorld hello) {
		hello.sayHello();
	}

}
