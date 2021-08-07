package test;

import java.util.Scanner;

public class MainApplication {
	static int[] numbers;
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("How many numbers you want to enter");
		int tot=sc.nextInt();
		numbers=new int[tot];
		System.out.println("enter the numbers");
		for (int i = 0; i < tot; i++) {
			numbers[i]=sc.nextInt();
		}	
		Thread2 obj1= new Thread2();
		Thread threadTwo=new Thread(obj1);
		threadTwo.start();
		Thread3 obj2= new Thread3();
		Thread threadThree=new Thread(obj2);
		threadThree.start();
		
		
	}

}
