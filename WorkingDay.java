package GuviProgs;

import java.util.Scanner;

public class WorkingDay {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String day=sc.nextLine();
		if(day.equals("Sunday")||day.equals("SUNDAY")||day.equals("SATURDAY")||day.equals("sunday")||day.equals("saturday")||day.equals("Saturday"))
		{
			System.out.println(day+"="+"False");
		}
		else
		{
			System.out.println(day+"="+"True");
		}
	}
}
