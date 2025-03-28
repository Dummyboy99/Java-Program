package com.array;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {
		String [] s= {"ABC","DEF","GHI"};
		String [] s1=new String[s.length];
		for(int i=s.length-1;i>=0;i--) {
			String a=s[i];
			char [] c=a.toCharArray();
			String s2="";
			for(int j=c.length-1;j>=0;j--) {
				s2+=c[j];
			}
			 s1[s.length - 1 - i] = s2;
		}
		System.out.println(Arrays.toString(s1));

	}

}
