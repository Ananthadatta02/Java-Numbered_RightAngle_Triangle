package number_patterns;

import java.util.Scanner;

/*
1
12
123
1234
12345

 */
public class Numbered_RightAngle_Triangle 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = s.nextInt();
		for(int i=1;i<=n;i++)
		{
			int num = 1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(num++);
			}
			System.out.println();
		}
	}
}
