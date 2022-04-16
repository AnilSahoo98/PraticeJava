package number_programming;

import java.util.Scanner;

public class AbundantNumber {
	static void div(int n) {
		int sum=0;
		
		for(int i=1;i<n;i++) {
			if (n%i==0){
				 sum = sum+i;
				
			}
			
		}
		System.out.println(sum);
		greatsum(n,sum);
	}
	static void greatsum(int n,int sum) {
		if (n<sum) {
			System.out.println("its a abundantNUmber");
			
				
		}
		else {
			System.out.println("its not a abundant Number");
		}
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = new Scanner(System.in).nextInt();
		div(n);
	}

}
