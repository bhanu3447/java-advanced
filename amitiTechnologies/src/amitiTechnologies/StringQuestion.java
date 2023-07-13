//package amitiTechnologies;
//
//import java.util.Scanner;
//
//public class StringQuestion
//{
//	public static void main(String[] args) 
//	{
//		Scanner scn = new Scanner(System.in);
//		System.out.println("enter input 1");
//		String input1=scn.nextLine();
//		System.out.println("enter input 2");
//		int input2=scn.nextInt();
//		System.out.println(output(input1,input2));
//	}
//	
//	public static String output(String input1,int input2)
//	{
//		StringBuilder sb = new StringBuilder();
//		int num=0;
//		int a=0;
//		
//		while(a<input1.length())
//		{
//			char ch=input1.charAt(a);
//			if(ch>='0'&&ch<='9')
//			{
//				num=num*10+(ch-'0');
//			}
//			else
//			{
//				if(num==0)
//				{
//					sb.append(ch);
//				}
//				else
//				{
//					int quotient=num / input2;
//					int remainder=num%input2;
//					if(remainder==0)
//					{
//						sb.append(String.valueOf(ch).repeat(factorial(quotient)));
//					}
//					else
//					{
//						sb.append(ch);
//					}
//					num=0;
//				}
//			}
//			a++;
//		}
//		return sb.toString();
//		
//	}
//
//	private static int factorial(int quotient) 
//	{
//		int fact=1;
//		for(int i=2;i<=quotient;i++)
//		{
//			fact*=i;
//		}
//		return fact;
//	}
//
//	
//}
//

package amitiTechnologies;

import java.util.Scanner;

public class StringQuestion

{

	public static void main(String[] args)

	{

		Scanner scn = new Scanner(System.in);

		System.out.println("enter input 1");

		String input1 = scn.nextLine();

		System.out.println("enter input 2");

		int input2 = scn.nextInt();

		System.out.println(output(input1, input2));

	}

	public static String output(String input1, int input2)

	{

		StringBuilder sb = new StringBuilder();

		int num = 0;

		int a = 0;

		while (a < input1.length())

		{

			char ch = input1.charAt(a);

			if (ch >= '0' && ch <= '9')

			{

				num = num * 10 + (ch - '0');

			}

			else

			{

				if (num == 0)

				{

					sb.append(ch);

				}

				else

				{

					int quotient = num / input2;

					int remainder = num % input2;

					if (remainder == 0)

					{

						sb.append(String.valueOf(ch).repeat(factorial(quotient)));

					}

					else

					{

						sb.append(ch);

					}

					num = 0;

				}

			}

			a++;

		}

		return sb.toString();

	}

	private static int factorial(int quotient)

	{

		int fact = 1;

		for (int i = 2; i <= quotient; i++)

		{

			fact *= i;

		}

		return fact;

	}

}
