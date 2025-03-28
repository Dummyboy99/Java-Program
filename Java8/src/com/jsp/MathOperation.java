package com.jsp;

interface Math{
	public int operation(int a,int b);
}
public class MathOperation {
	public static void main(String[] args) {
		Math addition=(a,b)->a+b;
		Math substraction=(a,b)->a-b;
		System.out.println("Addition of 2 numbers:"+addition.operation(20,30));
		System.out.println("Substraction of 2 numbers:"+substraction.operation(30,20));

	}

}
