package sorting.algorithms;

public class SearchingAlgorithms
{
  public static void main(String[] args)
  {
//	int []a= {11,22,14,6,8,0};
//	System.out.println(linearSearch(a, 6));
	  
	  
	  int[]a= {12,25,65,201,365,892};
	  System.out.println(binarySearch(a,12));
//	  System.out.println(binarySearchRecurrsion(a, 892, 0, a.length-1));
	  
  }
  
  public static int linearSearch(int[]a,int x)
  {
	  for(int i=0;i<a.length;i++)
	  {
		  if (a[i]==x) return i;
	  }
	  return -1;
  }
  
  //binary search using while loop
  public static  int binarySearch(int []a,int x)
  {
	  int start=0;
	  int end=a.length-1;
	
	  while(start<=end)
	  {
		  int mid=(start+end)/2;
		  if(x==a[mid])return mid;
		  else if(x<a[mid]) end=mid-1;
		  else start=mid+1;
	  }
	return-1;
	  
  }
  //binary search using recurrsion
  public static int binarySearchRecurrsion(int a[],int x,int start,int end)
  {
	 if(start>end) return -1;
	 int mid=(start+end)/2;
	 if(x==a[mid]) return mid;
	 else if(x<a[mid]) return binarySearchRecurrsion(a, x, start, mid-1);
	 else  return binarySearchRecurrsion(a, x,mid+1,end);
  }
}
