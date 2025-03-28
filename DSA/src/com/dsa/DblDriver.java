package com.dsa;

public class DblDriver {

	public static void main(String[] args) {
		DoubleLinkedlist l=new DoubleLinkedlist();
		l.add(20);
		l.add(46);
		l.add(76);
		l.add(69);
		l.add(11);
		l.add(84);
		l.add(77);
		l.add(38);
		l.remove(0);
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		System.out.println(l.size());
		l.reverse();
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		

	}

}
