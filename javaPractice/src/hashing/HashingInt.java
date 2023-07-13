package hashing;

//class node
//{
//	int key;
//	node next;
//	public node(int key, node next) 
//	{
//		super();
//		this.key = key;
//		this.next = next;
//	}
//	
////}
//public class HashingInt 
//{
//	
// private node []a=new node[10];
// private int count=0;
//  public boolean add(int k)
//  {
//	  int index=k%10;
//	  if(a[index]==null)
//	  {
//		  a[index]=new node(k, null);
//		  count++;
//		  return false;
//	  }
//	  node prev=null;
//	  node curr=a[index];
//	  while(curr!=null)
//	  {
//		  if(curr.key==k) return false;
//		  prev=curr;
//		  curr=curr.next;
//	  }
//	  prev.next=new node(k, null);
//	  count++;
//	  return true;
//  }
//  public int size()
//  {
//	  return count;
//  }
//  public void display()
//  {
//	  for(int i=0;i<a.length;i++)
//	  {
//		  node curr=a[i];
//		  while(curr!=null)
//		  {
//			  System.out.println(curr.key);
//			  curr=curr.next;
//		  }
//	  }
//  }
//  
//  public static void main(String[] args)
//  {
//	HashingInt h = new HashingInt();
//	h.add(20);
//	h.add(265);
//	h.add(30);
//	h.add(12);
//	h.add(30);
//	System.out.println(h.size());
//	h.display();
//  }
//}
//
