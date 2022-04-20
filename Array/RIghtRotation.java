package Array;

public class RIghtRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int [] {1,2,3,4,5,6,7};
		
		int n =2;
		
		System.out.println("Original array: ");  
		
	    for (int i = 0; i < arr.length; i++) {   
	            System.out.print(arr[i] + " ");   
	        }
	    for (int i=0;i<n;i++) {
	    	int last ,j;
	    	last = arr[arr.length-1];
	    	System.out.println(last+" "+arr.length);
	    	for( j=arr.length-1;j>0;j--) {
	    		arr[j]=arr[j-1];
	    		System.out.println(arr[j]);
	    		
	    	}
	    	arr[0]= last;
	    }
	    System.out.println("Array after right rotation: ");  
        for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " ");  
        }  
	}

}
