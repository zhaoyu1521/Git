package com.byzx.mybatis.test;

public class Test111 {
	public static void main(String[] args) {
		System.out.println(dg(100));
	}
	
	/*static int dg(int i) {
		int sum;
		if (i == 1)
		return 1;
		else
		sum = i + dg(i - 1);
		return sum;
	}*/
	static int dg(int i) {
		int sum;
		if(i==1)
			return 1;
		else
			sum=i+dg(i-1);
		return sum;
	}
	
	
	
	
	
	
	
	
	
}
