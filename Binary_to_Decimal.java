package com.dsa.Pattern;

public class Binary_to_Decimal {
public static void Dec(int n) {
	int m=n;
	int pow=0;
	int deci=0;
	while(n>0) {
		int last_digit=n%10;
		deci=deci+(last_digit*(int)Math.pow(2, pow));
		pow++;
		n=n/10;
	}
		System.out.println("Decimal of "+m+ "= "+deci);
	}

	public static void main(String args[]) {
	Dec(101);	
	}
}

