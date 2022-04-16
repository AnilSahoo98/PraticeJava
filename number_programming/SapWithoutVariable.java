package number_programming;

import java.util.Scanner;

public class SapWithoutVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("Enter the two number : \t");
		x = x+y;
		y=x-y;
		x=x-y;
		System.out.println(x+""+y);
	}

}
