package GuviProgs;

import java.util.Scanner;
public class IndexOfString {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		System.out.println("Enter the string to be searched:");
		String search=sc.nextLine();
		if(str.contains(search))
		{
			int index=str.indexOf(search);
			System.out.println(index);
		}
		else
		{
			System.out.println("-1");
		}

	}

}
