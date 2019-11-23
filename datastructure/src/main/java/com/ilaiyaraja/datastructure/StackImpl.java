package com.ilaiyaraja.datastructure;



public class StackImpl implements Stack{
	private int size = 0 ;
	private int top = -1;
	Student[] objects =null;
	
	public StackImpl() {
		
	}
	public StackImpl(int size) {
		this.top = -1;
		this.size = size;
		this.objects = new Student[size];
	}
	
	public boolean push(Student obj) {
		if(!isFull()) {
			top++;
			objects[top]=obj;
			return true;
		}
		else {
			System.out.println("Stack is full after adding the "+objects.length+"nd element.. Resize the stack to add more elements...");
			return false;
		}
		
	}

	public boolean isFull() {
		return (objects.length-1 == size);
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public Student pop() {
		if(!isEmpty()) {
			return objects[top--];
		}
		else {
			System.out.println("No more Elements to return.. Exiting...");
			System.exit(0);
			return null;
		}
	}

}
