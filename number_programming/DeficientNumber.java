package number_programming;

import java.util.Scanner;

public class DeficientNumber {
	
	 static void div(int n) {
		int divsum=0;
		System.out.println("sum of the number");
		
		for(int i=1;i<n;i++) {
			if (n%i==0)
				 divsum= divsum+i;
			
			
		}
		System.out.println(divsum );
		
	}
		static void divsum(int n, int divsum){
			
			
			
			if (divsum<n) 
				System.out.println("its a Deficient Number");
				else 
					System.out.println("its not a deficient Number");
				
			
			
		}
	
	public static void main(String[] args) {
		System.out.println("enter the number");
		@SuppressWarnings("resource")
		int n = new Scanner(System.in).nextInt();
		div(n);
		
		
	
		
	}

}
