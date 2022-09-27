package kr.co.soldesk.beans;

public class TestBean7 {
	
	private int data1;
	private double data2;
	private String data3;
	
	public TestBean7() {
		System.out.println("TestBean7의 생성자");
		this.data1 = 0;
		this.data2 = 0.0;
		this.data3 = null;
	}

	public TestBean7(int data1) {
		System.out.println("TestBean7의 생성자 : int 변수 1개짜리");
		this.data1 = data1;
		this.data2 = 0.0;
		this.data3 = null;
	}
	
	public TestBean7(double data2) {
		System.out.println("TestBean7의 생성자 : double 변수 1개짜리");
		this.data1 = 0;
		this.data2 = data2;
		this.data3 = null;
	}
	
	public TestBean7(String data3) {
		System.out.println("TestBean7의 생성자 : String 변수 1개짜리");
		this.data1 = 0;
		this.data2 = 0.0;
		this.data3 = data3;
	}
	
	public TestBean7(int data1, double data2, String data3) {
		System.out.println("TestBean7의 생성자 : int double String 각각 1개씩");
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
	}
	
	public void printData() {
		System.out.println("data1 : "+ data1);
		System.out.println("data2 : "+ data2);
		System.out.println("data3 : "+ data3);
	}
	
}
