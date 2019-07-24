package com.byzx.study.string;

import java.util.Scanner;

public class String_3 {
	public static void main(String[] args) {
		/*
		 * 三：回文字符串判断。所谓回文是指正读和反读都一样的数或文本段 ，如abcba、1234321等。编写程序，从键盘输入字符串，
		 * 由程序判断是否为回文串，并给出提示。
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("请输入字符串：");
		String str = in.next();
		String newStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			newStr += str.charAt(i);
		}
		if (newStr.equals(str)) {
			System.out.println("是回文串");
		} else {
			System.out.println("不是回文串");
		}
		
	}
}
