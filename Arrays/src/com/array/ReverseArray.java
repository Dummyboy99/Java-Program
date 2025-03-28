package com.array;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int [] a= {1,3,4,5,6,7,2,9};
		int [] b=new int[a.length];
		int count=0;
		for(int i=a.length-1;i>=0;i--) {
			b[count++]=a[i];
		}
		System.out.println(Arrays.toString(b));
	}

}
