package com.byzx.study.string;

import java.util.Scanner;

public class String_1 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	
	String newStr="";
	for (int i = 0; ; i++) {
		System.out.println("请输入一个课程：");
		String str=in.next();
		if(str.equals("#")) {
			break;
		}else {
			newStr+=str+" ";
		}
	}
	System.out.println(newStr);
}
}
