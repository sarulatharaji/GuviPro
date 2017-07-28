package GuviHunter;

import java.util.Scanner;

public class ReduceSpace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String output =str.replaceAll("\\s+"," "); 
		System.out.println(output);
		
	}

}
