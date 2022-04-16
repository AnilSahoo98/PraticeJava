package basic_programming;

import java.util.Scanner;

public class Volume_of_Sphere {
	private static double pie = 3.14;
	private int radius;
	private static int div = (4/3);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the radius of the Sphere\t");
		double rad = sc.nextDouble();
		double radius= rad*rad*rad;
		double Sphere =  (4/3)*pie*rad*rad*rad;
		System.out.println("Volume of the Sphere: \t"+Sphere);
	
		
		
		// TODO Auto-generated method stub

	}

}
