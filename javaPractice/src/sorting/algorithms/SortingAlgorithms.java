package sorting.algorithms;

public class SortingAlgorithms
{
  public static void main(String[] args) 
  {
	int[]a= {2,12,6,7,8,9};
//	bubbleSort(a);
//	insertionSort(a);
//	selectionSort(a);
//	quickSort(a, 0, a.length-1);
	mergeSort(a);
	for(int s:a)
	{
		System.out.println(s);
	}
  }
 
  
  /*******bubble sort*********/
  public static void bubbleSort(int[]a)
  {
	  for (int i = 0; i < a.length-1; i++) 
	  {
		  boolean flag=true;
		for (int j = 0; j < a.length-1-i; j++)
		{
			if(a[j]>a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
		if(flag==false) break;
	  }
  }
  /*******insertion sort*********/
  
  public static void insertionSort(int a[]) 
  {
	for(int i=1;i<a.length;i++)
	{
		int key=a[i];
		int j=i-1;
		while(j>=0&&a[j]>key)
		{
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=key;
	}
  }
  
  /*******selection sort*********/
  public static void selectionSort(int a[])
  {
	  for(int i=0;i<a.length-1;i++)
	  {
		  int index=i;
		  for(int j=i+1;j<a.length;j++)
		  {
			  if(a[j]<a[index]) index=j;
		  }
		  if(i!=index)
		  {
		  int temp=a[index];
		  a[index]=a[i];
		  a[i]=temp;
		  }
	  }
  }
	  
	  /*************quick sort**************/
	  public static void quickSort(int []a,int start,int end)
	  {
		  if(start>=end) return;
		  int i=start;
		  int j=end;
		  int pivot=a[(start+end)/2];
		  
		  while(i<=j)
		  {
			  while(a[i]<pivot)i++;
			  while(a[j]>pivot)j--;
			  if(i<=j)
			  {
				  int temp=a[i];
				  a[i]=a[j];
				  a[j]=temp;
				  i++;
				  j--;
			  }
		  }
		 
		  quickSort(a, start, j);
		  quickSort(a, i,end);
	  }
	  /*************merge**************/
	  public static void mergeSort(int[]a)
	  {
		  if(a.length==1) return;
		  int[]l=new int[a.length/2];
		  int[]r=new int[a.length-l.length];
		  int i=0;
		  while(i<l.length)
		  {
			  l[i]=a[i];
			  i++;
		  }
		  int j=0;
		  while(j<r.length)
		  {
			  r[j]=a[i];
			  i++;
			  j++;
		  }
		  mergeSort(l);
		 mergeSort(r);
		  merge(l,r,a);
		  
	  }
	  private static void merge(int[]a,int[]b,int[]c)
	  {
		  int i=0;
		  int j=0;
		  int k=0;
		  while(i<a.length&&j<b.length)
		  {
			  if(a[i]<b[j])
			  {
				  c[k]=a[i];
				  i++;
				  k++;
			  }
			  else
			  {
				  c[k]=b[j];
				  k++;
				  j++;
			  }
		  }
		  while(i<a.length)
		  {
			  c[k]=a[i];
			  k++;
			  i++;
		  }
		  while(j<b.length)
		  {
			  c[k]=b[j];
			  k++;
			  j++;
		  }
	  }
  
}
