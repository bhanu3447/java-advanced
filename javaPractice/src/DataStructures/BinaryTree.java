//package DataStructures;
//
//class node
//{
//	int key;
//	node left;
//	node right;
//	public node(int key, node left, node right) {
//		super();
//		this.key = key;
//		this.left = left;
//		this.right = right;
//	}
//	public node(int key) {
//		super();
//		this.key = key;
//	}
//	
//	
//}
//public class BinaryTree 
//{
//   private node root=null;
//   private node left=null;
//   private node right=null;
//   private int count=0;
//   
//   public boolean add(int k)
//   {
//	   if(root==null)
//	   {
//		   root=new node(k);
//		   count++;
//		   return true;
//	   }
//	   node curr=root;
//	   node prev=null;
//	   while(curr!=null )
//	   {
//		   if(k<curr.key)
//		   {
//			   prev=curr;
//			   curr=curr.left;
//		   }
//		   else if(k>curr.key)
//		   {
//			   prev=curr;
//			   curr=curr.right;
//		   }
//		   else
//		   {
//			   return false;
//		   }
//	   }
//	   if(k<prev.key)
//	   {
//		   prev.left=new node(k);
//	   }
//	   else if(k>prev.key)
//	   {
//		   prev.right=new node(k);
//	   }
//	   count++;
//	   return true;
//   }
//   public int size()
//   {
//	   return count;
//   }
//
//   
//}
