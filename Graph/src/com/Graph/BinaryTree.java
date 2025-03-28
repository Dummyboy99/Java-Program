package com.Graph;

import java.util.Scanner;

public class BinaryTree {
	Node root;
	int count=0;
	public void add(int key) {
		root=new Node(key);
		populate(root);
	}
	public void populate(Node n) {
		System.out.println("Do You Want To Insert Ele left side of:"+n.key);
		boolean left=new Scanner(System.in).nextBoolean();
		if(left) {
			n.left=new Node(new Scanner(System.in).nextInt());
			populate(n.left);
		}
		System.out.println("Do You Want To Insert Ele right side of:"+n.key);
		boolean right=new Scanner(System.in).nextBoolean();
		if(right) {
			n.right=new Node(new Scanner(System.in).nextInt());
			populate(n.right);
		}
	}
	public void PrettyDisplay() {
		PrettyDisplay(root,0);
	}
	public void PrettyDisplay(Node n,int level) {
		if(n==null) return;
		PrettyDisplay(n.right,level+1);
		if(level!=0) {
			for(int i=0;i<level-1;i++) {
				System.out.println("|\t");
			}
			System.out.println("========="+n.key);
		}
		else {
			System.out.println(n.key);
		}
		PrettyDisplay(n.left, level+1);
	}
}
