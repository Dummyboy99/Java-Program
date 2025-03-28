package com.dsa;

public class ArraylistDriver {

	public static void main(String[] args) {
		Arraylist a=new Arraylist();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		a.remove(3);
		a.add(3,69);
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
	}

}
