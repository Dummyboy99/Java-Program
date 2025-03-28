package com.hash;

public class Hashset{
	private Node [] a=new Node[10];
	private int count=0;
	public int hash(int key) {
		return Math.abs(key%10);
	}
	public boolean add(int key) {
		int index=hash(key);
		if(a[index]==null) {
			a[index]=new Node(key);
			count++;
			return true;
		}
		Node curr=a[index];
		Node prev=null;
		while(curr!=null) {
			if(curr.key==key)return false;
			prev=curr;
			curr=curr.next;
		}
		prev.next=new Node(key);
		count++;
		return true;
	}
	public int size() {
		return count;
	}
	public void display() {
		for(int i=0;i<a.length;i++) {
			Node curr=a[i];
			while(curr!=null) {
				System.out.println(curr.key);
				curr=curr.next;
			}
		}
	}
	public String toString() {
		display();
		return " ";
	}
	public boolean remove(int key) {
		int index=hash(key);
		Node curr=a[index];
		Node prev=null;
		while(curr!=null) {
			if(curr.key==key) {
				if(prev==null) {
					a[index]=curr.next;
				}
				else {
					prev.next=curr.next;
				}
				count--;
				return true;
			}
			prev=curr;
			curr=curr.next; 
		}
		return false;
	}
	
}
