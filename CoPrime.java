package GuviProgs;
import java.util.Scanner;
public class CoPrime 
{
	 static int gcd(int a, int b) {
		    int t;
		    while(b != 0){
		        t = a;
		        a = b;
		        b = t%b;
		    }
		    return a;
		}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int n=sc.nextInt();
		int num=gcd(p,n);
	    if(gcd(p,n)==1)
	    {
	      System.out.println("Co-prime");
	    }
	    else
	    {
	    	System.out.println("Not Co-prime");
	    }
	    sc.close();
	}
}
