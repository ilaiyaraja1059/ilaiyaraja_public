package com.ilaiyaraja.datastructure;

public class DataStructures {

	
	public static void main(String [] arg) {
		Stack stack = new StackImpl(2);
		stack.push(new Student(1,18,"Ilaiyaraja"));
		stack.push(new Student(2,22,"Ilaiyaraja"));
		stack.push(new Student(3,30,"Ilaiyaraja"));
		for(int i=0;i<2;i++) {
		System.out.println(stack.pop().toString());
		}
	}
}
