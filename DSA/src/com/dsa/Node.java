package com.dsa;

public class Node {
Node next;
Object ele;
	public Node(Object e,Node n) {
		next=n;
		ele=e;
	}
	public Node(Object e) {
		ele=e;
	}

}
