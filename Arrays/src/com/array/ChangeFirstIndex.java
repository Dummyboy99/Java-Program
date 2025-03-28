package com.array;

import java.util.Arrays;

public class ChangeFirstIndex {

	public static void main(String[] args) {
		String [] s= {"ABC","DEF","GHI"};
		String [] s1=new String[s.length];
		for(int i=0;i<s.length;i++) {
			String a=s[i];
			char [] ch=a.toCharArray();
			String s2="";
			if(ch[0]>='A' && ch[0]<='Z') {
				ch[0]=(char)(ch[0]+32);
			}
			for(int j=0;j<ch.length;j++) {
				s2+=ch[j];
			}
			s1[i]=s2;
		}
		System.out.println(Arrays.toString(s1));
	}

}
