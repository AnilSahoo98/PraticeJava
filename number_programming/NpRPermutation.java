package number_programming;

import java.util.Scanner;

public class NpRPermutation {
	static void nF(int n) {
		
		
	}
	static void rF(int r,int n) {
		int rSum=1;
		int fac=n-r;
		for (int i=1;i<=fac;i++) {
			rSum=rSum*i;
		}
		System.out.println(rSum);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = new Scanner(System.in).nextInt();
		int r = new Scanner(System.in).nextInt();
		int nSum=1;
		for(int i=1;i<=n;i++) {
			nSum=nSum*i;
		}
		System.out.println(nSum);
		int rfac=1; //for nCr 
		int rSum=1;
		int fac=n-r;
		for (int i=1;i<=fac;i++) {
			rSum=rSum*i;
		}
		for (int i=1;i<=r;i++) {
			rfac = rfac*i;
			
		}
		System.out.println("rfac"+rfac);
		System.out.println(rSum);
		int R = rfac*fac;// for nCr changing 
		System.out.println(R);
		int NPr = nSum/R;
		
				System.out.println("NcR:" +NPr);
	}

}
