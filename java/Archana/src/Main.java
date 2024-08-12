package M;

public class linked_list {

	public static class Node{
		int data;
		Node next;
		public Node(int data)
		{
			this.data = data;
			this.next=null;
		}
	}
	
	public static Node head;
	public static Node tail;
	public static int size;
	
	public void print()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	public void count()
	{
		int c=0;
		Node temp=head;
		while(temp!=null)
		{
			temp=temp.next;
			c++;
		}
		System.out.println("count: "+c);
	}
	
	public void sum()
	{
		int sum=0;
		Node temp=head;
		while(temp!=null)
		{
			sum+=temp.data;
			temp=temp.next;
		}
		System.out.println("sum: "+sum);
	}
	
	public void avg()
	{
		int c=0,sum=0;
		Node temp=head;
		while(temp!=null)
		{
			c++;
			sum+=temp.data;
			temp=temp.next;
		}
		System.out.println("average: "+sum/c);		
	}
	
	public void min()
	{
		Node temp=head;
		int min=temp.data;
		while(temp!=null)
		{
			if(min>temp.data)
			{
				min=temp.data;
			}
			temp=temp.next;
		}
		System.out.println("Minimum: "+min);
	}
	
	public void recprint(Node temp)
	{
		//Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data+"->");
			return;
		}
		//System.out.println("null");
		recprint(temp.next);
	}
	
	public void addfirst(int data)
	{
		size++;
		Node newNode =  new Node(data);
		if(head==null)
			head=tail=newNode;
		else
		{
			newNode.next = head;
			head=newNode;
		}		
	}
	
	public void addlast(int data)
	{
		size++;
		Node newNode =  new Node(data);
		if(head==null)
			head=tail=newNode;
		else
		{
			tail.next = newNode;
			tail=newNode;
		}		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linked_list ll=new linked_list();
		ll.addfirst(5);
		ll.addfirst(4);
		ll.addfirst(3);
		ll.addlast(6);
		ll.addlast(7);
		ll.addlast(8);
		//ll.recprint(head);
		ll.print();
		ll.count();
		ll.sum();
		ll.avg();
		ll.min();

	}

}
