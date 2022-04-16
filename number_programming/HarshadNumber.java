package number_programming;

import java.util.Scanner;



public class HarshadNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum =0,rem=0,result=num;
		while(num>0) {
			rem = num%10;
			sum = sum+rem;
			num=num/10;
			
			System.out.println(sum);
		}
		int d = result%sum;
//		System.out.println("d ="+d);
//		System.out.println("\"sum:\"+sum,\"result:\"+result" +sum+result);
		
		if (d==0)
			System.out.println("its a harshard numder"+sum);
		else
			System.out.println("its not a harsad numder"+sum);
		
		
	}

}
