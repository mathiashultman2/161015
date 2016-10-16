package biz.mathias.main;

import org.slf4j.Logger;

public class Main {
	private Logger logger;
	public static void main(String[] args) {
		new Main().go();
	}
	public void go(){
		System.out.println("in go");
	}
}
