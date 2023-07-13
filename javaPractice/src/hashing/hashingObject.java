package hashing;

class Node
{
	Object element;
	Node next;
	public Node(Object element, Node next) {
		super();
		this.element = element;
		this.next = next;
	}
	
}
public class hashingObject 
{
  private Node a[]=new Node[10];
  private int count=0;
  public boolean add(Object k)
  {
	  int index=k.hashCode()%10;
	  index=Math.abs(index);
	  if(a[index]==null)
	  {
		  a[index]=new Node(k, null);
		  count++;
		  return true;
	  }
	  Node prev=null;
	  Node curr=a[index];
	  while(curr!=null)
	  {
		  if(k.equals(curr.element)) return false;
		  prev=curr;
		  curr=curr.next;
	  }
	  prev.next=new Node(k, null);
	  count++;
	  return true;
  }
  public int size()
  {
	  return count;
  }
  public void display() 
  {
	  for(int i=0;i<a.length;i++)
	  {
		  Node curr=a[i];
		  while(curr!=null)
		  {
			  System.out.println(curr.element);
			  curr=curr.next;
		  }
	  }
  }
  public static void main(String[] args) 
  {
	hashingObject h = new hashingObject();
	h.add(20);
	h.add(20.0);
	h.add("20");
	h.add('2');
	h.add("so what1");
	System.out.println(h.size());
	h.display();
}
}
