package ex;

import java.util.Scanner;

/*
 * Topic: 輸入一串數字，寫出一數字拆解函數decomp(n)，將其個別數字用空白分開。例如:輸入128917178, 則輸出1 2 8 9 1 7 1 7 8
 * Date: 2016/10/31
 * Author: 1050210XX 周永振老師
 */

public class ex03 {

	public static void main(String[] args) {
	Scanner sca=new Scanner(System.in);
	String n=sca.nextLine();
	decomp(n);
	}

	private static void decomp(String n) {
	char arr[]=n.toCharArray();
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	}

}
