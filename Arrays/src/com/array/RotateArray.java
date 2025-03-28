package com.array;

import java.util.Arrays;

public class RotateArray {
	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6,7};
		int k=2;
		rotate(a,k);
		System.out.println(Arrays.toString(a));
	}
	public static void rotate(int [] a,int k) {
		int n=a.length;
		k%=n;
		int [] temp=new int[n];
		int count=0;
		for(int i=a.length-1;i>k;i--) {
			temp[count++]=a[i];
		}
		for(int i=0;i<=k;i++) {
			temp[count++]=a[i];
		}
		System.out.println(Arrays.toString(temp));
		System.arraycopy(temp, 0, a, 0, n);
	}
}
