package kr.co.soldesk.main;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.soldesk.beans.CollectionBean;
import kr.co.soldesk.beans.DataBean;
import kr.co.soldesk.beans.TestBean10;

public class MainClass5 {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/soldesk/config/beans5.xml");
		TestBean10 t10 = ctx.getBean("t10", TestBean10.class);
		List<String> list1 = t10.getList1();
		for(String str : list1) {
			System.out.println("list1 : "+ str);
		}
		System.out.println("================");
		
		List<Integer> list2 = t10.getList2();
		for(Integer value : list2) {
			System.out.println("list2 : "+ value);
		}
		System.out.println("================");
		
		List<DataBean> list3 = t10.getList3();
		for(DataBean obj : list3) {
			System.out.println("list3 : "+ obj);
		}
		
		Set<String> set1 = t10.getSet1();
	      for (String s : set1)
	         System.out.println("set1 : " + s);
	      System.out.println("---------------");
	      Set<Integer> set2 = t10.getSet2();
	      for (Integer s : set2)
	         System.out.println("set2 : " + s);
	      System.out.println("---------------------------");
	      Set<DataBean> set3 = t10.getSet3();
	      for (DataBean obj : set3)
	         System.out.println("set1 : " + obj);
	      System.out.println("---------------------------");
		
		System.out.println("--------------------------------------");
		
		
		Map<String, Object> map1 = t10.getMap1();
		
		String a1 = (String)map1.get("a1");
		Integer a2 = (Integer)map1.get("a2");
		DataBean a3 = (DataBean)map1.get("a3");
		DataBean a4 = (DataBean)map1.get("a4");
		List<String> a5 = (List<String>)map1.get("a5");
		
		System.out.println("a1 : "+a1);
		System.out.println("a2 : "+a2);
		System.out.println("a3 : "+a3);
		System.out.println("a4 : "+a4);
		
		for(String str : a5) {
			System.out.println("a5 : "+str);
		}
		
		System.out.println("--------------------------------------");

		Properties prop1 = t10.getProp1();
		
		String p1 = prop1.getProperty("p1");
		String p2 = prop1.getProperty("p2");
		String p3 = prop1.getProperty("p3");
		
		System.out.println("p1 : "+p1);
		System.out.println("p2 : "+p2);
		System.out.println("p3 : "+p3);
		
		System.out.println("--------------------------------------");
		CollectionBean addr = ctx.getBean("addr", CollectionBean.class);
		List<String> addrlist = addr.getAddressList();
		for(String str : addrlist) {
			System.out.println("addrlist : "+str);
		}
		
		
		ctx.close();
	}

}
