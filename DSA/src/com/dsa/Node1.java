package com.dsa;

public class Node1 {
	Node1 prev;
	Node1 next;
	Object ele;
	public Node1(Object ele,Node1 prev,Node1 next) {
		this.ele=ele;
		this.next=next;
		this.prev=prev;
	}
	public Node1(Object ele) {
		this.ele=ele;
	}

}
