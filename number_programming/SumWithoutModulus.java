package number_programming;

import java.util.Scanner;

public class SumWithoutModulus {

	public static void main(String[] args) {
		int sum =0;
		// TODO Auto-generated method stub
		String s = new Scanner(System.in).next();
		int len = s.length();
		 char[] n = s.toCharArray();  
		System.out.println(s.length());
		for(int i=0;i<len;i++) {
			
			sum = sum+(int)n[i];
			   sum = sum-48;  ;
			
		}
		System.out.println(sum);
	}

}
