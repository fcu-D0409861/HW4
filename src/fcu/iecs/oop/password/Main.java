package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(true)
		{
			System.out.println("Please enter :");
			String word =scanner.nextLine();
			if(word.equals("exit"))
			{
				break;
			}			
			PasswordEncorder encode = new PasswordEncorder();
			System.out.println("encode :");
			System.out.println(encode.encode(word));
			
		}
	}

}
