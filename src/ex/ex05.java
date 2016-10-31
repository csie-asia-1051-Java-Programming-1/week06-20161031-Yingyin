package ex;

import java.util.Scanner;

/*
 * Topic: 使用者輸入一個大正整數值，請設計一個函數fun1(n)可以計算該大數字裡的數字總合。例如:輸入: 4832 則輸出 17
 * Date: 2016/10/31
 * Author: 1050210XX 周永振老師
 */

public class ex05 {

	public static void main(String[] args) {
	Scanner sca=new Scanner(System.in);
	String n= sca.nextLine();
	System.out.println(fun1(n));
	}

	private static int fun1(String n) {
	int ans=0;
	char arr[]=n.toCharArray();
	for(int i=0;i<arr.length;i++)
	{
		ans+=(int)(arr[i]-'0');
	}
		return ans;
	}

}
