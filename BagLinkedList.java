import java.util.*;

class BagLinkedList<T>
{
	Node head;
	int count;
	BagLinkedList()
	{
		count = 0;
		head = new Node();
	}
	
	//check if bag is empty
	public boolean isEmpty()
	{
		if(count == 0)
			return true;
		else
			return false;
	}
	
	//get current number of items in bag
	public int count()
	{
		System.out.println("Current number of items in bag "+count);
		return count;
	}
	
	public void add(T item)
	{
		Node temp = new Node(item);
		temp.next = head;
		head = temp;
		count++;
	}
	
	public void showAll()
	{
		Node curr = head;
		
		while(curr.next != null)
		{
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}
	
	public boolean remove()
	{
		if(head.next == null)
			return false;
		head = head.next;
		count--;
		return true;
		
	}
	
	public boolean remove(T item)
	{
		Node curr = head;
		Node linker = head;
		
		while(curr.next != null)
		{
			if(curr.data.equals(item))
			{
				if(head == curr)
				{
					head = head.next;
				}
				else
				{
					
					linker.next = curr.next;
				}
				count--;
				return true;
			}
			linker = curr;
			curr = curr.next;
		}
		return false;
	}
	
	public static void main(String args[])
	{
		BagLinkedList bag = new BagLinkedList();
		System.out.println(bag.isEmpty());
		System.out.println(bag.remove());
		bag.add(1);
		bag.showAll();
		bag.add(10);
		bag.showAll();
		bag.remove(1);
		bag.showAll();
	}
}
class Node<T>
{
	T data;
	Node next;
	Node()
	{
	}
	Node(T data)
	{
		this.data = data;
	}
}