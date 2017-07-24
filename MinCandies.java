package GuviProgs;

import java.util.Scanner;

public class MinCandies {

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no.of.students");
	int n=sc.nextInt();
	int sum=0;
	int moreRating[]=new int[n];
	for(int i=0;i<n;i++)
	{
		moreRating[i]=sc.nextInt();
	}
	int count=0;
	for(int i=0;i<n;i++)
	{
		if(moreRating[i]<moreRating[i+1])
		{
			count=count+1;
			sum=sum+count;
		}
		else
		{
			sum=sum+count;
		}
	}
	System.out.println("Minimum num of candies are"+sum);
	}

}
