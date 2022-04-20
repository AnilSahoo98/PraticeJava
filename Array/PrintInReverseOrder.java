package Array;

public class PrintInReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr[]= new int [] {1,2,3,4,5,6,8};
//		int rev[]= new int[] {arr.length};
//		for(int i=0;i<arr.length;i++) 
//		{
//			for (int j=arr.length-1;j<=0;j--) {
//				rev[i]=arr[j];
//				
//				System.out.println(rev[i]);
//				
//			} 
//			
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(rev[i]);
//		}
		System.out.println(arr.length);
		for (int i = arr.length-1; i >= 0; i--) {   
            System.out.print(arr[i] + " ");   
        }    
	}

}
