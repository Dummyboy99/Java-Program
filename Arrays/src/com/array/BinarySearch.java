package com.array;

public class BinarySearch {

	public static void main(String[] args) {
		int [] a= {10,20,30,40,50,60};
		int k=50;
		System.out.println(search(a,k,0,a.length-1));

	}
	public static int search(int [] a,int key,int st,int end) {
		if(st>end)return -1;
		int mid=(st+end)/2;
		if(key==a[mid]) return mid;
		else if(key>a[mid]) return search(a,key,mid+1,end);
		else return search(a,key,st,mid-1);
	}

}
