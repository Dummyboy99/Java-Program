package com.bst;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySt {
	private Node root;
	private int count=0;
	boolean flag;
	public boolean add(int key) {
		flag=true;
		root=add(root,key);
		return flag;
	}
	public Node add(Node n,int key) {
		if(n==null) {
			n=new Node(key);
			count++;
			return n;
		}
		if(key<n.key)n.left=add(n.left,key);
		else if(key>n.key)n.right=add(n.right,key);
		else flag=false;
		return n;
	}
	public int size() {
		return count;
	}
	public boolean isEmpty() {
		return size()==0;
	}
	public void PreOrder() {
		PreOrder(root);
		System.out.println();
	}
	public void PreOrder(Node n) {
		if(n==null) return;
		System.out.print(n.key+"\t");
		PreOrder(n.left);
		PreOrder(n.right);
	}
	public void PostOrder() {
		PostOrder(root);
		System.out.println();
	}
	public void PostOrder(Node n) {
		if(n==null)return;
		PostOrder(n.left);
		PostOrder(n.right);
		System.out.print(n.key+"\t");
	}
	public void InOrder() {
		InOrder(root);
		System.out.println();
	}
	public void InOrder(Node n) {
		if(n==null) return;
		InOrder(n.left);
		System.out.print(n.key+"\t");
		InOrder(n.right);
	}
	public void LevelOrder() {
		Queue <Node> q=new LinkedList<Node>();
		if(root!=null)q.add(root);
		while(!q.isEmpty()) {
			Node n=q.poll();
			System.out.print(n.key+"\t");
			if(n.left!=null)q.add(n.left);
			if(n.right!=null)q.add(n.right);
		}
		System.out.println();
	}
	public int smallestKey() {
		Node min=MinNode(root);
		return min.key;
	}
	public Node MinNode(Node n) {
		if(n.left==null) return n;
		return MinNode(n.left);
	}
	public int largestKey() {
		Node max=maxNode(root);
		return max.key;
	}
	public Node maxNode(Node n) {
		if(n.right==null) return n;
		return maxNode(n.right);
	}
	public boolean contains(int key) {
		return contains(root,key);
	}
	public boolean contains(Node n,int key) {
		if(n==null)return false;
		if(key<n.key)return contains(n.left,key);
		else if(key>n.key)return contains(n.right,key);
		else return true;
	}
	public void remove(int key) {
		root=remove(root,key);
	}
	public Node remove(Node n,int key) {
		if(n==null) return null;
		if(key<n.key) n.left=remove(n.left,key);
		else if(key>n.key)n.right=remove(n.right,key);
		else {
			count--;
			if(n.left==null && n.right==null) n=null;
			else if(n.left==null) n=n.right;
			else if(n.right==null) n=n.left;
			else {
				Node mNode=maxNode(n.left);
				n.key=mNode.key;
				n.left=remove(n.left,mNode.key);
				
			}
		}
		return n;
	}
}
