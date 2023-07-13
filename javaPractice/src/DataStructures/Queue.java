//
//package DataStructures;
//
//
//
//public class Queue 
//{
//  private Node first =null;
//  private Node last=null;
//  private int count=0;
//  public void add(Object e)
//  {
//	  if(first==null)
//	  {
//		  first=new Node(e, null);
//		  last=first;
//		  count++;
//		  return;
//	  }
//	  last.next=new Node(e, null);
//	  last=last.next;
//	  count++;
//  }
//  public int size()
//  {
//	  return count;
//  }
//  public boolean isEmpty()
//  {
//	  if(first==null) return true;
//	  return false;
//  }
//  public Object peek() 
//  {
//	  if(isEmpty()) return null;
//	  return first.element;
//  }
//  public Object poll()
//  {
//	  if (isEmpty()) return null;
//	  Object element=first.element;
//	  first=first.next;
//	  count--;
//	  if(isEmpty()) last=null;
//	  return element;
//  }
//  
//  
// 
//}
