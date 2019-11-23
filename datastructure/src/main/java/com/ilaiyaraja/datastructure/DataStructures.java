package com.ilaiyaraja.datastructure;

public class DataStructures {

	
	public static void main(String [] arg) {
		/* 
		 // Uncomment the below lines to test the stack data structure
		Stack stack = new StackImpl(5);
		stack.push(new Student(1,18,"Ilaiyaraja"));
		stack.push(new Student(2,22,"Ilaiyaraja"));
		System.out.println(stack.pop().toString());
		stack.push(new Student(3,30,"Ilaiyaraja"));
		for(int i=0;i<5;i++) {
		System.out.println(stack.pop().toString());
		} */
		Queue queue=new QueueImpl(5);
		queue.enQueue(new Student(1,18,"Ilaiyaraja"));
		queue.enQueue(new Student(2,22,"Ilaiyaraja"));
		queue.enQueue(new Student(3,30,"Ilaiyaraja"));
		queue.enQueue(new Student(4,30,"Ilaiyaraja"));
		queue.enQueue(new Student(5,30,"Ilaiyaraja"));
		System.out.println(queue.deQueue().toString());
		queue.enQueue(new Student(6,30,"Ilaiyaraja"));
		for(int i=0;i<7;i++) {
			System.out.println(queue.deQueue().toString());
			}
	}
}
