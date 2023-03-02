package org.simplecalc;

import java.util.Scanner;

public class calc {
	static int a, b;

	public void add() {
		int c = a + b;
		System.out.println("Adding both Numbers:" + c);
	}

	public void sub() {
		int c = a - b;
		System.out.println("Subracting both Numbers:" + c);
	}

	public void divide() {
		double d = a;
		double c = d / b;
		System.out.println("Dividing both Numbers:" + c);
	}

	public void multiply() {
		int c = a * b;
		System.out.println("Multiplying both Numbers:" + c);
	}

	public static void main(String[] args) {
		System.out.println("perfoms  addition ,subraction,division,multiplication");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number:");
		a = s.nextInt();
		System.out.println("Enter first number:");
		b = s.nextInt();
		System.out.println("first no:" + a);
		System.out.println("second  no:" + b);

		calc c = new calc();
		c.add();
		c.sub();
		c.divide();
		c.multiply();
	}
}
