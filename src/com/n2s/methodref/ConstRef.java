package com.n2s.methodref;

public class ConstRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message m = Display::new;
		m.getMessage("Hello");
	}

}

class Display {
	Display(String msg) {
		System.out.println(msg);
	}
}

interface Message {
	public Display getMessage(String msg);
}
