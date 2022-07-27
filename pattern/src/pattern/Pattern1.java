package pattern;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner aa =new Scanner(System.in);
		int n= aa.nextInt();
		int p= aa.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=n-i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int k=0;k<p;k++)
		{
			for(int l=0;l<=k;l++)
			{
				System.out.print("* ");
			}
			for(int l=p-k;l>1;l++)
			{
				System.out.print(" ");
			}
			
			System.out.println();
		}

	}

}
