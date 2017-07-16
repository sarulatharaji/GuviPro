package GuviProgs;

import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine().toLowerCase();
		char[] str1=str.toCharArray();
		boolean isPangram=true;
		String alpha="abcdefghijklmnopqrstuvwxyz";
		if(str.length()<26)
		{
			isPangram=false;
		}
		else
		{
		
		for(int i=0;i<str.length();i++)
		{
			if(str1[i]>='a'||str1[i]<='z')
			{
				isPangram=true;
			}
			else
			{
				break;
			}
		}
		}
		if(isPangram)
		{
		System.out.println("The string is a Pangram");
		}
		else
		{
			System.out.println("The string is not a Pangram");
		}
	}

}
