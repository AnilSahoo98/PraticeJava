package number_programming;

import java.util.Scanner;

public class TwistedNumber {	
	static void IsPrimeNumber() {
		int n = 0;
		boolean flag=false;
		int rem=n/2;
		for (int i=2;i<=rem;i++) {
			if(n%i==0) {
				flag=true;
				break;
			}
			
		}
		if(!flag)
			System.out.println(n+"n");
		else
			System.out.println(n+"!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = new Scanner(System.in).nextInt();
		IsPrimeNumber();
	}

}
