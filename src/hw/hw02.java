package hw;

import java.util.Scanner;

public class hw02 {

	public static void main(String[] args) {
	Scanner sca = new Scanner(System.in);
	int type=sca.nextInt();
	float height=sca.nextFloat();
	if(type==1)
	{
		System.out.println(man(height));
	}else if(type==2)
	{
		System.out.println(femle(height));
	}
	
	}
	
   private static float man(float height) {
		return (float)((height-170)*0.6+62) ;
	}



	private static float femle(float height) {
		return (float)((height-158)*0.5+52);
	}
}
	
