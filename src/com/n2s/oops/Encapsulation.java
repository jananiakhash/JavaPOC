package com.n2s.oops;



public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example3 obj = new Example3();
		obj.sms();
		
	}

}

class Example3 {
	public void sms() {
		System.out.println("sms1");
		InnerExample n=new InnerExample();
		n.sms3();
	}

	private void sms2() {
		System.out.println("sms2");
	}

	private class InnerExample {
		public void sms3() {
			System.out.println("sms3");
		}
	}
}