package org.program;

public class SumOfDigit {
	public static void main(String[] args) {
		int num=1234;
		int res = 0;
		int rem = 0;
		while (num>0) {
			rem= num % 10;
			res= res+rem;
			num= num/10;
					
		}
		System.out.println(res);
	}
}
