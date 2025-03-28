package com.hash;

public class Node {
	Node next;
	int key;
	public Node(Node next,int key) {
		this.next=next;
		this.key=key;
	}
	public Node(int key) {
	    this.key=key;
	}

}
