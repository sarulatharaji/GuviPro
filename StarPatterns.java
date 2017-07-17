package GuviProgs;
import java.util.*;
public class StarPatterns{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		  for(int i=size;i>0;i--)
		  {
			  for(int j=i;j>0;j--)
			  {
				  System.out.print("*");
			  }
			  System.out.print(" ");
			  for(int j=i;j>0;j--)
			  {
				  System.out.print("*");
			  }
			  System.out.println();
		  }   	        
	}
}
