package com.hash;

public class HashDriver {

	public static void main(String[] args) {
		Hashset h=new Hashset();
		h.add(30);
		h.add(62);
		h.add(69);
		h.add(11);
		h.add(35);
		h.add(43);
		h.add(54);
		h.add(46);
		h.add(98);
		h.add(40);
		h.remove(30);
		System.out.println(h.add(70));
		System.out.println(h);
		

	}

}
