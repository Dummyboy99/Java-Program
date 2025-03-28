package com.dsa;

public class LinkedlistDriver {

	public static void main(String[] args) {
		Linkedlist l=new Linkedlist();
		l.add(10);
		l.add(58);
		l.add(69);
		l.add(75);
		l.add(21);
		l.add(20);
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		l.reverse();
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}

	}

}
