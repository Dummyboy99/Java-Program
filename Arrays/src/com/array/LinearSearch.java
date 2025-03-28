package com.array;

public class LinearSearch {

	public static void main(String[] args) {
		int [] a= {40,10,45,30,68,90};
		int key=68;
		System.out.println(search(a,key));
	}
	public static int search(int [] a,int key) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) return i;
		}
		return -1;

	}

}
