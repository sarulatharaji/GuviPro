package Pro;
import java.util.*;
public class StrangeCounter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int counter=3;
		while(t>counter)
		{
			t=t-counter;
			counter=counter*2;
		}
		System.out.println(counter-t+1);
		sc.close();
	}

}
