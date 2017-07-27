package GuviProgs;
import java.util.Scanner;
public class StringOddReverse {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	//Reading input string from the user
	String string=scan.nextLine();
	//splitting the string and storing in a array
	String[] split=string.split(" ");
	String reverse="";
	String result="";
	//The result is obtained using the loops
  for(int i=0;i<split.length;i++)
	{
	//reversing the even position values
	reverse=split[i];
	if(i%2==0)
	{	
	StringBuffer buff=new StringBuffer(reverse).reverse();
	result=buff.toString();
	System.out.print(result+" ");
	}
	//printing the odd position values
	if(i%2==1)
	{
		result=split[i];
		System.out.print(result+" ");
	}
	}
	scan.close();
	}
}
