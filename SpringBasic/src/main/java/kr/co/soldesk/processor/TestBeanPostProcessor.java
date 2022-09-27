package kr.co.soldesk.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class TestBeanPostProcessor implements BeanPostProcessor{

	//init-method 호출전
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		
		System.out.println("before");
		switch (beanName) {
		case "t1":
			System.out.println("id가 t1인 bean 객체 시작");
			break;
			
		case "t2":
			System.out.println("id가 t2인 bean 객체 시작");
			break;	
		}
		return bean;
	}
	
	//init-method 호출후
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		System.out.println("after");
		return bean;
	}
	
	
}
