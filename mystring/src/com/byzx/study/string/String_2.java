package com.byzx.study.string;

import java.util.Scanner;

public class String_2 {
	public static void main(String[] args) {
		/*
		 * 二：输入你的名字的拼音(格式：姓.名字)和性别， 输出相应的问候语“你好，**先生/女士”。 如李小路则输入：Li.xiaolu，女，
		 * 控制台会输出“你好，Li女士”
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("请输入你的姓名拼音：");
		String name = in.next();
		System.out.println("请输入性别：");
		String sex=in.next();
		int num=name.indexOf(".");
		String xing=name.substring(0,num);
		System.out.println("你好，"+xing+sex+"士");
	}
}
