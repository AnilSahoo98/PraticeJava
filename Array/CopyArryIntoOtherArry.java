package Array;

import java.util.Scanner;

public class CopyArryIntoOtherArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int as=0;
//		System.out.println("ENTER THE SIZE OF THE ARRAY ");
//		int sc = new Scanner(System.in).nextInt();
//		for (int i=0;i<sc;i++) {
//			System.out.println("enter the number from :"+sc);
//			int mc = new Scanner(System.in).nextInt();
//		}
		int arr[]= new int [] {2,4,5,6,7,8,9};
		int arr1[]= new int[arr.length];
		for ( int i =0;i<arr1.length;i++) {
			arr1[i]=arr[i];
				
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		   System.out.println();  
	          
	        //Displaying elements of array arr2   
	        System.out.println("Elements of new array: ");  
	        for (int i = 0; i < arr1.length; i++) {   
	           System.out.print(arr1[i] + " ");  
	        }   
	}

}
