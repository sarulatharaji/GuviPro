package GuviProgs;
import java.util.*;
public class ReversingList {
	public static void reverse(List list)
	{
		int size=list.size();
		for(int i=size-1;i>=0;--i)
		{
			System.out.println(list.get(i));
		}
	}
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0;i<num;++i)
		{
			list.add(sc.next());
		}
		reverse(list);
		sc.close();
	}

}
