package com.array;

import java.util.Arrays;

public class LargestSmallest {

	public static void main(String[] args) {
		int [] a= {1,3,4,5,6,7,2,9};
		Arrays.sort(a);
		System.out.println("Largest elemeent in the array:n mj"+a[a.length-1]);
		System.out.println("Smallest elemeent in the array:"+a[0]);

	}

}
