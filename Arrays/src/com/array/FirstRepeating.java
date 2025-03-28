package com.array;

import java.util.LinkedHashSet;
import java.util.Set;

public class FirstRepeating {

	public static void main(String[] args) {
		int [] a= {5,9,6,1,5,2,9,8};
		System.out.println(duplicatelement(a));

	}
	public static int duplicatelement(int [] a) {
		Set<Integer>s=new LinkedHashSet<Integer>();
		for(int n:a) {
			if(s.contains(n)) {
				return n;
			}
			s.add(n);
		}
		return -1;
		
	}

}
