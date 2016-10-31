package ex;

import java.util.Scanner;

/*
 * Topic: 寫一函數 square(n,c)，以 c 字元，印出邊長為 n 之實心正方形。Ex：square(3,'@') 將印出如下形狀
 @@@
 @@@
 @@@
 * Date: 2016/10/31
 * Author: 1050210XX 周永振老師
 */

public class ex01 {

	public static void main(String[] args) {
	Scanner sca = new Scanner(System.in);
	int n=sca.nextInt();
	String ch=sca.next();
	square(n,ch.charAt(0));
	}

	private static void square(int n, char ch) {
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(ch);
			}	
		System.out.println();
		}
	
	}

}
