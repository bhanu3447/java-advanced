package twod_array;

import java.util.Scanner;

public class scanner 
{
public static void main(String[] args)
  {
	Scanner scanner = new Scanner(System.in);
//	System.out.println("enter no of rows");
//	int row=scanner.nextInt();

	int [][]a=new int[4][];
	a[0][0]=0;
	a[0][1]=13;
	a[1][0]=81;
	a[1][1]=31;
	a[2][0]=61;
	a[2][1]=51;
	
	for(int[] s:a)
	{
		for(int z:s)
		{
			System.out.print(z);
		}
		System.out.println();
	}
	
	
	
//	Scanner scanner = new Scanner(System.in);
//	System.out.println("enter no of rows");
//	int row=scanner.nextInt();
//	
//	System.out.println("enter no of columns");
//	int col=scanner.nextInt();
//	  int [][]a=new int[row][col];
//	  int x=scanner.nextInt();
//	  
//	  System.out.println(a.length);
//	  System.out.println("enter 2d array");
//	  for(int i=0;i<row;i++)
//	  {
//		  for(int j=0;j<col;j++)
//		  {
//			  a[i][j]=scanner.nextInt();
//		  }
//	  }
//	  
//	  for(int i=0;i<row;i++)
//	  {
//		  for(int j=0;j<col;j++)
//		  {
//			  if(x==a[i][j]) System.out.println("element location="+i+" "+j);
//		  }
//	  }
}
}
