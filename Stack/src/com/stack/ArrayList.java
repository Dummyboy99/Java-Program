package com.stack;

import java.util.EmptyStackException;

public class ArrayList {
private Object [] a;
private int count=0;
public ArrayList() {
	a=new Object[5];
}
public void push(Object ele) {
	if(count>=a.length) increase();
	a[count++]=ele;
	return;
}
public void increase() {
	Object [] temp=new Object[a.length+3];
	for(int i=0;i<a.length;i++) {
		temp[i]=a[i];
	}
	a=temp;
}
public int size() {
	return count;
}
public boolean isEmpty() {
	return size()==0;
}
public Object pop() {
	if(isEmpty()) throw new EmptyStackException();
	count--;
	Object e=a[count];
	a[count]=null;
	return e;
}
public Object peek() {
	if(isEmpty()) throw new EmptyStackException();
	return a[count-1];
}
}
