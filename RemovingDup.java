package GuviProgs;

import java.util.*;

public class RemovingDup 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] arr=str.toCharArray();
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[i]==arr[j])
				{
					int temp=j;
					for(int k=j;k<len-1;k++)
					{
						arr[k]=arr[k+1];
					}
					j--;
					len--;
				}
				
			}
		}
		String NoDup=new String(arr);
		NoDup=NoDup.substring(0,len);
		System.out.println(NoDup);
	}
}