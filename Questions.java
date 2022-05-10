package org.add;

public class Questions {
	
	Questions(){
		System.out.println("Constuctor");
	}
	
	static void method()
	{
		System.out.println("Static method");
	}
	
	public static void main(String[] args) {
		
		Questions.method();
	}

	
}
