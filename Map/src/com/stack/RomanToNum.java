package com.stack;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanToNum {

	public static void main(String[] args) {
		System.out.println(roman(1245));

	}
	public static String roman(int n) {
		Map<Integer,String>m=new LinkedHashMap<Integer,String>();
		String s="";
		m.put(1, "I");
		m.put(2, "II");
		m.put(3, "III");
		m.put(4, "IV");
		m.put(5, "V");
		m.put(9, "IX");
		m.put(10, "X");
		m.put(40, "XL");
		m.put(50, "L");
		m.put(90, "XC");
		m.put(100, "C");
		m.put(400, "CD");
		m.put(500, "D");
		m.put(900, "CM");
		m.put(1000, "M");
		int [] a= {1000,900,500,400,100,90,50,40,10,9,5,4,3,2,1};
		for(int num:a) {
			while(n>=num) {
				s+=m.get(num);
				n-=num;
			}
		}
		return s;
	}

}
