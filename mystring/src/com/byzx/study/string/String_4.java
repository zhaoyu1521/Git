package com.byzx.study.string;

import java.util.Scanner;

public class String_4 {
public static void main(String[] args) {
/*四：实现用户注册功能，用户输入账号、密码和确认密码，注册用户！
要求：
	  a.用户的帐号为邮箱形式，必须对邮箱进行验证
	  b.密码必须和确认密码一致
	  c.密码的长度必须是8-16位
      d.用户的帐号不能包涵china，中国，共产党这些敏感字符
	  e.用户输入非法要给用户合理的提示
     (提示：该注册功能可以做成两种形式，一种是密码最多输入3次，
     3次都输入不正确则不允许再注册，程序结束；一种是可以无限的输入，
            只要不正确就重新输入，直到正确才能结束)*/
	
	
	//实现用户注册
	Scanner in= new Scanner(System.in);
	System.out.println("注册账号：");
	//判断账号格式是否正确
		
	
		
	String username=in.nextLine();
	System.out.println("注册密码：");
	String password=in.nextLine();
	System.out.println("确认密码：");
	String confirmPassword=in.nextLine();
	
	//
	
	
}
}
