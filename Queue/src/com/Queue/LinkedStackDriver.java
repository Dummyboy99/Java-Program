package com.Queue;

public class LinkedStackDriver {

	public static void main(String[] args) {
		LinkedQueue l=new LinkedQueue();
		l.push(10);
		l.push(51);
		l.push(46);
		l.push(69);
		l.push(75);
		l.push(11);
		l.push(97);
		l.push(20);
		l.push(42);
		l.push(66);
		System.out.println(l.poll());
		System.out.println(l.peek());

	}

}
