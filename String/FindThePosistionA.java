package String;

public class FindThePosistionA {

	public static void main(String[] args) {
		String str = "Welcome to InterviewBit";
		int i=0, j=str.length()-1;
		char[] revString = new char [j+1];
		while (i<j) {
			revString[j]= str.charAt(i);
			revString[i]= str.charAt(i);
			i++;
			j--;
			
		}
		System.out.println("recersed String = "+ String.valueOf(revString));
		
		// TODO Auto-generated method stub

	}

}
