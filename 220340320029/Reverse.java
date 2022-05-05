class Reverse{

 Node head;

static class Node{
    int data;
	Node next;
	 
	 Node(int d){
	   this.data=d;
	   next=null;
}}
	

/*void insert(int d){
  if(head==null){
   this.head=new Node(d);
  }else
      {
	  Node newnode=new Node(d);
	  Node temp1=head;
	  while()
*/
	
	  void print1(Node n){
	  Node temp=n;	  
	  while(temp!=null){
	  System.out.println(temp.data+" ");
	  temp=temp.next;
	  
	  }}
	  
	    void print2(Node n){
	  Node temp=n;	  
	  while(temp!=null){
	  System.out.print(temp.data+" ");
	  temp=temp.next;
	  
	  }}
	  
	Node Rev(Node node){
		
		Node pre =null;
		Node cur=node;
		Node next=null;
		while(cur!=null){
			next=cur.next;
			cur.next=pre;
			pre=cur;
			cur=next;
		}
		node=pre;
		return node;	
		
	}  
   



public static void main(String [] args){

 Reverse r=new Reverse();
  r.head=new Node(1);
  r.head.next=new Node(2);
  r.head.next.next=new Node(3);
  r.head.next.next.next=new Node(4);
  r.head.next.next.next.next=new Node(5);
  
  //r.print1(r.head);
  r.head=r.Rev(r.head);
  
  r.print2(r.head);
  System.out.println("");
  Reverse r1=new Reverse();
  r1.head=new Node(3);
  r1.head.next=new Node(4);
  r1.head.next.next=new Node(5);
  r1.head.next.next.next=new Node(2);
  //r1.print1(r1.head);
  r1.head=r1.Rev(r1.head);
  r1.print2(r1.head);

}	 
	 

}


















