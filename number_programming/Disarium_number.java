package number_programming;

import java.util.Scanner;

public class Disarium_number {
int copy;
static int num;
static int rem=0;
static int sum=0;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner (System.in);
		num= sc.nextInt();
		String s = Integer.toString(num);
		int len = s.length();
		int copy=num;
		
		while(copy>0) {
			rem=copy%10;
			sum = sum+(int)Math.pow(rem, len);
			copy = copy/10;
			System.out.println("copy:"+copy);
			System.out.println("sum: "+sum);
			len = len-1;
			System.out.println("len " +len);
			
			
		}
		if(sum==num) 
			System.out.println(sum+ "its a disarium number");
			else
				System.out.println(sum+ "it not a disarium number");
		
		
		}
	
	 
			
			
}
	


