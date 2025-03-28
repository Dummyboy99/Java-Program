package com.dsa;

public class Arraylist {
private Object [] a;
private int count=0;
public Arraylist() {
	a=new Object[5];
}
public void add(Object e) {
	if(count>=a.length) increase();
	a[count++]=e;
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
public void add(int index,Object e) {
	if(index<=-1 || index>=size()) throw new ArrayIndexOutOfBoundsException();
	if(count>=a.length) increase();
	for(int i=size()-1;i>=index;i--) {
		a[i+1]=a[i];
	}
	a[index]=e;
	count++;
}
public Object get(int index) {
	if(index<=-1 || index>=size()) throw new ArrayIndexOutOfBoundsException();
	return a[index];
}
public void remove(int index) {
	if(index<=-1 || index>=size()) throw new ArrayIndexOutOfBoundsException();
	for(int i=index+1;i<size();i++) {
		a[i-1]=a[i];
	}
	a[--count]=null;
}
}
