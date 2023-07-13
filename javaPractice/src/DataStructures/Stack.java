package DataStructures;

import java.util.EmptyStackException;

public class Stack 
{
  private Node first=null;
  private int count=0;
  
  public void push(Object e)
  {
	  if(first==null)
	  {
		 first=new Node(e, null);
		 count++;
		 return;
	  }
	  first=new Node(e,first);
	  count++;
  }
  public int size()
  {
	  return count;
  }
  public boolean isEmpty()
  {
	  if(first==null) return true;
	  return false;
  }
  public Object peek() 
  {
	  if(isEmpty()) throw new EmptyStackException();
	  return first.element;
  }
  public Object pop()
  {
	  if(isEmpty()) throw new EmptyStackException();
	  Object element=first.element;
	  first=first.next;
	  count--;
	  return element;
  }
  
  public static void main(String[] args)
  {
	  Stack s=new Stack();
	  s.push(10);
	  s.push(210);
	  s.push(310);
	  s.push(410);
	  
	
	  System.out.println(s.pop());
	  System.out.println(s.peek());
	  System.out.println(s.isEmpty());
	  System.out.println(s.size());
	  
	
}
}
