package com.byzx.study.string;

import java.util.Scanner;

public class String_2 {
	public static void main(String[] args) {
		/*
		 * ��������������ֵ�ƴ��(��ʽ����.����)���Ա� �����Ӧ���ʺ����ã�**����/Ůʿ���� ����С·�����룺Li.xiaolu��Ů��
		 * ����̨���������ã�LiŮʿ��
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("�������������ƴ����");
		String name = in.next();
		System.out.println("�������Ա�");
		String sex=in.next();
		int num=name.indexOf(".");
		String xing=name.substring(0,num);
		System.out.println("��ã�"+xing+sex+"ʿ");
	}
}
