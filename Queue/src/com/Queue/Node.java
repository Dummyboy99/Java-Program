package com.Queue;

public class Node {
Node next;
Object ele;
public Node(Node next, Object ele) {
	this.next = next;
	this.ele = ele;
}
public Node(Object ele) {
	this.ele = ele;
}

}
