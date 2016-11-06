package hw;

import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {
	Scanner sca = new Scanner(System.in);
	int type;
	float V;
	V=sca.nextFloat();
	type=sca.nextInt();
	if(type==1)
	{
		System.out.println(C(V));
	}
	else if(type==2)
	{
		System.out.println(F(V));
	}
	
	}

	private static float F(float c) {
		
		return (float)(c*9.0/5.0+32.0);
	}

	private static float C(float f) {
		return (float)((f-32.0)*(5.0/9.0));
	}

}
