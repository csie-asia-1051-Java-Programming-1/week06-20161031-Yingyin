package ex;

import java.util.Scanner;

/*
 * Topic: 使用者輸入兩個整數，透過函數呼叫輸出排列組合函數 C(m,n)。公式: C(m,n) = m!/n!(m-n)!
 * Date: 2016/10/31
 * Author: 1050210XX 周永振老師
 */

public class ex02 {

	public static void main(String[] args) {
	Scanner sca =  new Scanner(System.in);
	int m=sca.nextInt();
	int n=sca.nextInt();
	System.out.println(C(m,n));
	}

	private static int C(int m, int n) {
	int temp1=1,temp2=2;
	for(int i=m-n+1;i<m;i++)
	{
		temp1*=i;
	}
	for(int i=1;i<n;i++)
	{
		temp2*=i;
	}
		return temp1/temp2;
	}

}
