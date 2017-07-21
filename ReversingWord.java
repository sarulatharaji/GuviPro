package GuviProgs;
import java.util.*;
public class ReversingWord {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String reverse[]=str.split(" ");
		String rev="";
		for(int i=reverse.length;i>0;i--)
		{
			rev=rev+reverse[i-1]+" ";
		}
		System.out.println(rev);
	}

}
