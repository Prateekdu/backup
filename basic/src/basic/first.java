package basic;
import java.util.*;
public class first {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fac=1;
		for(int i=1;i<=n;i++)
		{
			fac= fac*i;
		}
		System.out.println(fac);
		
		
		
	}
	
}
