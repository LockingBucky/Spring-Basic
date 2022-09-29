package kr.co.soldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.soldesk.beans.TestBean11;
import kr.co.soldesk.beans.TestBean12;
import kr.co.soldesk.beans.TestBean13;

public class MainClass6 {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/soldesk/config/beans6.xml");
		System.out.println("======== setter 주입을 이용한 객체 주입 ========");
		TestBean11 obj1 = ctx.getBean("obj1", TestBean11.class);
		System.out.println("obj1.data1 : "+obj1.getData1());
		System.out.println("obj1.data2 : "+obj1.getData2());
		System.out.println();
		
		System.out.println("======== byName을 이용한 객체 주입 ========");
		TestBean11 obj2 = ctx.getBean("obj2", TestBean11.class);
		System.out.println("obj2.data1 : "+obj2.getData1());
		System.out.println("obj2.data2 : "+obj2.getData2());
		System.out.println();

		System.out.println("======== byType을 이용한 객체 주입 ========");
		TestBean12 obj3 = ctx.getBean("obj3", TestBean12.class);
		System.out.println("obj3.data1 : "+obj3.getData1());
		System.out.println("obj3.data2 : "+obj3.getData2());
		System.out.println();
		
		System.out.println("======== 생성자를 이용한 주입 ========");
		TestBean13 obj4 = ctx.getBean("obj4", TestBean13.class);
		System.out.println("obj4.data1 : "+obj4.getData1());
		System.out.println("obj4.data2 : "+obj4.getData2());
		System.out.println("obj4.data3 : "+obj4.getData3());
		System.out.println("obj4.data4 : "+obj4.getData4());
		System.out.println();

		System.out.println("======== 생성자를 이용한 .자동. 주입 ========");
		TestBean13 obj5 = ctx.getBean("obj5", TestBean13.class);
		System.out.println("obj5.data1 : "+obj5.getData1());
		System.out.println("obj5.data2 : "+obj5.getData2());
		System.out.println("obj5.data3 : "+obj5.getData3());
		System.out.println("obj5.data4 : "+obj5.getData4());
		System.out.println();
		
		System.out.println("======== 생성자를 이용한 객체 주입 ========");
		TestBean13 obj6 = ctx.getBean("obj6", TestBean13.class);
		System.out.println("obj6.data1 : "+obj6.getData1());
		System.out.println("obj6.data2 : "+obj6.getData2());
		System.out.println("obj6.data3 : "+obj6.getData3());
		System.out.println("obj6.data4 : "+obj6.getData4());
		System.out.println();
		
		System.out.println("======== 생성자를 이용한 .자동. 객체 주입 ========");
		TestBean13 obj7 = ctx.getBean("obj7", TestBean13.class);
		System.out.println("obj7.data1 : "+obj7.getData1());
		System.out.println("obj7.data2 : "+obj7.getData2());
		System.out.println("obj7.data3 : "+obj7.getData3());
		System.out.println("obj7.data4 : "+obj7.getData4());
		System.out.println();
		
		System.out.println("default-autowire=byName 를 참고");
		TestBean11 obj8 = ctx.getBean("obj8", TestBean11.class);
		System.out.println("obj8.data1 : "+obj8.getData1());
		System.out.println("obj8.data2 : "+obj8.getData2());
		System.out.println();
		
		System.out.println("default-autowire=byName 를 참고");
		TestBean11 obj9 = ctx.getBean("obj9", TestBean11.class);
		System.out.println("obj9.data1 : "+obj9.getData1());
		System.out.println("obj9.data2 : "+obj9.getData2());
		System.out.println();
		
		
		
		ctx.close();
	}

}
