package ex;

import java.util.Scanner;

/*
 * Topic: 撰寫一函數void square(arr)，在呼叫square(arr) 函數後，一維陣列arr 裡的每一個元素皆會被平方。例如:輸入1 3 5 7, 則輸出1  9   25  49
 * Date: 2016/10/31
 * Author: 1050210XX 周永振老師
 */

public class ex04 {

	public static void main(String[] args) {
	Scanner sca=new Scanner(System.in);
	int n=sca.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sca.nextInt();
	}
	square(arr);
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	}

	private static void square(int arr[]) {
		for(int i=0;i<arr.length;i++)
		{
			arr[i]*=arr[i];
		}
	}

}
