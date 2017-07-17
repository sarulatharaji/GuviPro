package GuviProgs;

import java.util.*;

public class DescSort {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		LinkedList<Integer> list=new LinkedList<Integer>();
		for(int i=0;i<num;i++)
		{
			list.add(sc.nextInt());
		}
		list.sort(null);
		Iterator itr=list.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
