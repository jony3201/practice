package labtask;

import java.util.Scanner;

public class Fibonacci{
	
	public static void main(String []args)
	{
	Scanner S = new Scanner(System.in);
	System.out.println("Enter an number :");
	int num = S.nextInt();
	fibonacci(num);
    }
	public static void fibonacci(int num){
		int a1 = 0;
		int a2 = 1;
		int b = 0;
		int i;
		System.out.println("The series is : "); 
		for(i=1; i<=num;i++){
			 b = a1 + a2;
		System.out.print(+b+ " ");
			a1 = a2;
			a2 = b;
		}		
	}	
}