package labtask;

import java.util.Scanner;

public class sum_Average1 {

	public static void main(String[] args) {
		int n,sum=0;
		float average;
		Scanner s =new Scanner(System.in);
		System.out.print("Enter no of  element:");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the element:");
		for (int i = 0; i <n;i++)
		{
			a[i] = s.nextInt();
			sum = sum + a [i];
			
		}
     System.out.println("sum:"+sum);
     average = (float)sum/n;
     System.out.println("Average:"+average);
	}

}
