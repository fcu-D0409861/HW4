package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		System.out.println("Plese enter a number:");
		Scanner scanner = new Scanner(System.in);
	
		NissanTiida star = new NissanTiida();
		star.a = scanner.nextInt();
		
		for(int i=0;i<star.a;i++)
		{	
			star.tiida();
			System.out.println();
		}
	}

}
