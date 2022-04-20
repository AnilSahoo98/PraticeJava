package Array;

public class EvenPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//even position array
		int arr[]= new int [] {1,2,3,4,5,6,8,5};
		System.out.println("Even Position Array :");
		for(int i=0;i<arr.length;i++) {
			
			if(i%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		//odd position array
		System.out.println("Odd poistion Array :");
		for(int i=0;i<arr.length;i++) {
			if(i%2==1) {
				System.out.print(arr[i]+" ");
			}
		
	}
		}

}
