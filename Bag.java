import java.util.*;

public class Bag<T>
{
	protected int size;
	protected int count = 0;
	protected Object [] items;
	
	//bag constructor
	public Bag(int size)
	{
		this.size = size;
		items = new Object[size];
	}
	
	//check if bag is empty
	public boolean isEmpty()
	{
		if(count == 0)
			return true;
		else
			return false;
	}
	
	//check if bag is full
	public boolean isFull()
	{
		if(count == size)
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
	
	//add an item to bag
	//but if bag is full returns false
	public boolean add(Object a)
	{
		if(count == size)
			return false;
		items[count] = a;
		count++;
		return true;
	}
	
	//remove any object
	public boolean remove()
	{
		if(count == 0)
			return false;
		count--;
		items[count] = null;
		return true;
	}
	
	//remove a specific object
	public boolean remove(Object a)
	{
		int i = 0;
		boolean match = false;
		count--;
		
		while(i <= count)
		{
			if(a.equals(items[i]))
			{
				match = true;
				items[i] = items[count];
				items[count] = null;
				return true;
			}
			i++;
			
		}
		
		return false;
	}
	
	//clears the bag
	void removeAll()
	{
		count = 0;
		items = new Object[size];
	}
	
	//shows whats in the bag
	void showAll()
	{
		for(int i = 0; i < count; i++)
		{
			System.out.print(items[i]+" ");
		}
		System.out.println();
	}
	
	//check if bag contains object
	boolean contains(Object a)
	{
		for(int i = 0; i < count; i++)
		{
			if(items[i].equals(a))
				return true;
		}
		return false;
	}
	
	//returns count of how often an object occurs in bag
	int itemCount(Object a)
	{
		int occurs = 0;
		for(int i = 0; i < count; i++)
		{
			if(items[i].equals(a))
				occurs++;
		}
		return occurs;
	}
	

	public static void main(String[] args)
	{
		Bag bag = new Bag(10);
		System.out.println("Is bag empty "+bag.isEmpty());
		System.out.println("Is bag full "+bag.isFull());
		bag.count();
		System.out.println("Add "+bag.add(0));
		for(int i = 1; i < 10; i++)
		{
			bag.add(i);
		}			
		
		bag.showAll();
		bag.count();
		System.out.println("Is bag empty "+bag.isEmpty());
		System.out.println("Is bag full "+bag.isFull());
		bag.remove();
		bag.showAll();
		bag.count();
		bag.remove(1);
		bag.showAll();
		bag.count();
		
	}
}