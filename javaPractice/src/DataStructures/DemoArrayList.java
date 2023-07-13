package DataStructures;

import java.util.Iterator;

public class DemoArrayList 
{
  public static void main(String[] args)
  {
	ArrayList a = new ArrayList();
	a.add("bhanu");
	a.add(2);
	a.add('c');
	a.add(2.5);
	a.add(2000);
	
	
	System.out.println(a.get(4));
    a.add(0, "prakash");
    a.remove(1);
   System.out.println(a.size());
//   a.clear();
   System.out.println(a.toString());
    
	}
}
