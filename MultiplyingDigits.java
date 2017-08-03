package Pro;
import java.util.*;
public class MultiplyingDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		int temp=number;
		int sum=0;
		int seed=number;
		while(temp!=0)
		{
			seed*=(temp%10);
			sum+=(temp%10);
			temp/=10;
		}
		number=number*sum;
		if(number==seed)
		{
			System.out.println("Seed");
		}
		else
		{
			System.out.println("Not Seed");
		}
	}

}
