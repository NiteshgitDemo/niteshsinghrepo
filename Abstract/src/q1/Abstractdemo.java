package q1;

abstract class A {
	int a = 100;
	int b = 200;

	void meth1() {
		System.out.println("meth1");
	}

	static void meth2() {
		System.out.println("meth2");
	}

	abstract void meth3();
}

class B extends A {
	void meth3() {
		System.out.println("meth3");
	}
}

public class Abstractdemo {
	public static void main(String[] args) {
		B ob = new B();
		ob.meth1();
		B.meth2();
		ob.meth3();
	}
}
