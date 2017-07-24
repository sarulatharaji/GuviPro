package GuviProgs;
import java.util.Scanner;
public class StringLow {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String lowFirst=str.substring(0,2).toLowerCase();
		String endFirst=str.substring(str.length()-2,str.length()).toLowerCase();
		System.out.println(lowFirst+str.substring(2,str.length()-2)+endFirst);
	}

}
