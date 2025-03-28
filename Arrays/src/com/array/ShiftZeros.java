package com.array;

import java.util.Arrays;

public class ShiftZeros {

	public static void main(String[] args) {
		int [] a= {1,0,9,3,0,6,0};
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				a[count++]=a[i];
			}
		}
		while(count<a.length) {
			a[count++]=0;
		}
		System.out.println(Arrays.toString(a));
	}

}
