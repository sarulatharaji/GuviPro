package GuviProgs;
import java.util.*;
public class UniqueElement {
	static Scanner sc=new Scanner(System.in);
	public static ArrayList<Integer> list=new ArrayList<Integer>();
	public void Unique()
	{
		System.out.println("Enter the size:");
		int size=sc.nextInt();
		System.out.println("Enter the elements:");
		int []arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int flag=0;
		Arrays.sort(arr);
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(i!=j)
				{
					if(arr[i]!=arr[j])
					{
					flag=1;
					}
					else
					{
						flag=0;
						break;
					}
				}
			}
			if(flag==1)
			{
				System.out.println(arr[i]);
			}
		}
	}
	public static void main(String[] args) 
	{
		UniqueElement uniqueElement=new UniqueElement();
		uniqueElement.Unique();
	}

}
