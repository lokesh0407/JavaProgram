package org.program;

public class Palindrome {
public static void main(String[] args) {
	int num=141;
	int n= num;
	int res=0;
	int rem=0;
	while (num>0) {
		rem= num % 10;
		res= (res*10)+rem;
		num= num/10;
	}
	System.out.println(res);
	if (n==res) {
		System.out.println("palidrome");
	}
	else {
		System.out.println("not palindrome");
	}
}
}
