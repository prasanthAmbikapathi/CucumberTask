package com.interview;

public class autoBoxing {

	public static void main(String[] args) {
		int a=200;
		System.out.println(a);
	//autoBoxing
		Integer b=a;
		System.out.println(b);
	//autoUnBoxing
		int c=b;
		System.out.println(c);
		
		
	//Boxing
		Integer valueOf = Integer.valueOf(a);
		System.out.println(valueOf);
		Integer valueOf2 = Integer.valueOf(c);
		System.out.println(valueOf2);
	//unboxing
		int intValue = b.intValue();
		System.out.println(intValue);
		int intValue2 = b.intValue();
		System.out.println(intValue2);
		
	}

}
