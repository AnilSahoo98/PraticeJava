package number_programming;

public class PronicNumber {
	public static void isPronicNumber(){
		
		for(int i=0;i<=100;i++) {
			int pronic = i*(i+1);
			System.out.println("PronicNumber:" +pronic);
		}
			
	}

	public static void main(String[] args) {
		
		isPronicNumber();
		
		System.out.println();
		// TODO Auto-generated method stub

	}

}
