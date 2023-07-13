package DataStructures;

public class DemoLinkedList 
{
  public static void main(String[] args) 
  {
	 LinkedList l = new LinkedList();
	 l.add("bhanu");
	 l.add(99);
	 l.add('v');
	 l.add(2.2);
	 
	 System.out.println(l);
	 System.out.println(l.get(3));
	 l.add(0, "jikka");
	 System.out.println(l.get(1));
	 System.out.println(l);
	 l.remove(2);
	 System.out.println(l);

	 System.out.println(l.size());
//	 l.clear();
//	 System.out.println(l.toString());
     l.reverse();
     System.out.println(l);
  }
}
