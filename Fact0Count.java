package GuviProgs;

import java.math.BigInteger;
import java.util.Scanner;

public class Fact0Count {
	
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	BigInteger fact= BigInteger.ONE; 
	for (int i=num;i>0;i--)
	{ 
		fact=fact.multiply(BigInteger.valueOf(i));
	} 
	int count=0;
	for(int i=5;num/i>=1;i*=5){
        count+=num/i;
    }    
	System.out.println(fact);
	System.out.println(count);
	}

}
