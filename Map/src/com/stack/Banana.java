package com.stack;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Banana {

	public static void main(String[] args) {
		String s="banana";
		Map<Character,String>m=new LinkedHashMap<Character,String>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(!m.containsKey(ch)) {
				m.put(ch,i+"");
			}
			else {
				m.put(ch,m.get(ch)+","+i);
			}
		}
		System.out.println(m);
		Set<Character>set=m.keySet();
		Iterator<Character>i=set.iterator();
		while(i.hasNext()) {
			Object o=i.next();
			System.out.println(o+"="+m.get(o));
		}
	

	}

}