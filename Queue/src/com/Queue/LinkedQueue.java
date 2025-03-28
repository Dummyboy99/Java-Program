package com.Queue;

public class LinkedQueue {
private Node first=null;
private int count=0;
public void push(Object ele) {
	if(first==null) {
		first=new Node(ele);
		count++;
		return;
	}
	Node curr=first;
	while(curr.next!=null) {
		curr=curr.next;
	}
	curr.next=new Node(ele);
	count++;
}
public int size() {
	return count;
}
public boolean isEmpty() {
	return size()==0;
}
public Object peek() {
	if(isEmpty()) return null;
	return first.ele;
}
public Object poll() {
	if(isEmpty()) return null;
	Object e=first.ele;
	first=first.next;
	count--;
	return e;
}
}
