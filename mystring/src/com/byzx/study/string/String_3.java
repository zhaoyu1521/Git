package com.byzx.study.string;

import java.util.Scanner;

public class String_3 {
	public static void main(String[] args) {
		/*
		 * ���������ַ����жϡ���ν������ָ�����ͷ�����һ���������ı��� ����abcba��1234321�ȡ���д���򣬴Ӽ��������ַ�����
		 * �ɳ����ж��Ƿ�Ϊ���Ĵ�����������ʾ��
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("�������ַ�����");
		String str = in.next();
		String newStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			newStr += str.charAt(i);
		}
		if (newStr.equals(str)) {
			System.out.println("�ǻ��Ĵ�");
		} else {
			System.out.println("���ǻ��Ĵ�");
		}
		
	}
}
