package biz.mathias.main;

public class Main {
	public static void main(String[] args) {
		System.out.println("check");
		new Main().go();
	}
	public void go(){
		System.out.println("in go");
		System.out.println("a newline in first");
		System.out.println("added printline");
		System.out.println("conflicting line");
	}
}
