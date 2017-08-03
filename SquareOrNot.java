package Pro;
import java.util.*;
public class SquareOrNot
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int x1=sc.nextInt();
	int y1=sc.nextInt();
	int x2=sc.nextInt();
	int y2=sc.nextInt();
	int x3=sc.nextInt();
	int y3=sc.nextInt();
	int x4=sc.nextInt();
	int y4=sc.nextInt();
	if((x1==x3)&&(y1==y3)&&(x2==x4)&&(y2==y4))
	{
		System.out.println("Square");
	}
	else
	{
		System.out.println("Not Square");
	}
	sc.close();
}
}
