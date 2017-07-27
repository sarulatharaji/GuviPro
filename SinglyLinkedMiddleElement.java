package GuviProgs;
import java.util.*;
public class SinglyLinkedMiddleElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//setting size of list
		int size=sc.nextInt();
		LinkedList<Integer> list=new LinkedList<Integer>();
		//Reading inputs for specified size
		for(int i=0;i<size;i++)
		{
			list.add(sc.nextInt());
		}
		int getSize=list.size();
		//storing middle value
		int midValue=getSize/2;
			//returning middle value if even size or odd size
			if(size%2==0)
			{
				System.out.println(list.get(midValue));
			}
			else
			{
				System.out.println(list.get(midValue));
			}
		sc.close();
	}

}
