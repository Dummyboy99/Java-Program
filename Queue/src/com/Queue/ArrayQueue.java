package com.Queue;

public class ArrayQueue {
private Object[] a;
private int count;
public ArrayQueue() {
	a=new Object[5];
}
public void push(Object ele) {
	if(count>=a.length) increase();
	a[count++]=ele;
	count++;
}
private void increase() {
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
public Object peek() {
	if(isEmpty()) return null;
	return a[0];
}
public Object poll() {
	if(isEmpty()) return null;
	Object e=a[0];
	for(int i=1;i<a.length;i++) {
		a[i-1]=a[i];
	}
	count--;
	a[count]=null;
	return e;
}
}
