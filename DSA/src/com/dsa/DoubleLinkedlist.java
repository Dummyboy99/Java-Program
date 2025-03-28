package com.dsa;

public class DoubleLinkedlist {
private Node1 first=null;
private int count=0;
public void add(Object ele) {
	if(first==null) {
		first=new Node1(ele);
		count++;
		return;
	}
	Node1 curr=first;
	while(curr.next!=null) {
		curr=curr.next;
	}
	curr.next=new Node1(ele,curr,null);
	count++;
}
public int size() {
	return count;
}
public void add(int index,Object ele) {
	if(index<=-1 || index>=size()) throw new IndexOutOfBoundsException();
	if(index==0) {
		Node1 n=new Node1(ele,null,first);
		first.prev=n;
		first=n;
		count++;
		return;
	}
	Node1 curr=first;
	for(int i=1;i<index;i++) {
		curr=curr.next;
	}
	Node1 n=new Node1(ele,curr,curr.next);
	curr.next.prev=n;
	curr.next=n;
	count++;
}
public Object get(int index) {
	if(index<=-1 || index>=size()) throw new IndexOutOfBoundsException();
	Node1 curr=first;
	for(int i=1;i<=index;i++) {
		curr=curr.next;
	}
	return curr.ele;
}
public void remove(int index) {
	if(index<=-1 || index>=size()) throw new IndexOutOfBoundsException();
	if(index==0) {
		first=first.next;
		if(first!=null)first.prev=null;
		count--;
		return;
	}
	Node1 curr=first;
	for(int i=1;i<index;i++) {
		curr=curr.next;
	}
	curr.next=curr.next.next;
	if(curr.next!=null)curr.next.prev=curr;
	count--;
}
public void reverse() {
	Node1 curr=first,prev=null,next=null;
	while(curr!=null) {
		next=curr.next;
		curr.next=prev;
		curr.prev=next;
		prev=curr;
		curr=next;
	}
	first=prev;
}
}
