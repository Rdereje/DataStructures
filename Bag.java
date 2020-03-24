import java.util.*;

public class Bag<T>
{
	protected int size;
	protected int count = 0;
	protected Object [] items;
	
	public Bag(int size)
	{
		this.size = size;
		items = new Object[size];
	}
	
	public boolean empty()
	{
		if(count == 0)
			return true;
		else
			return false;
	}
	
	public boolean full()
	{
		if(count == size)
			return true;
		else
			return false;
	}
	
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
	
	public boolean remove()
	{
		if(count == 0)
			return false;
		count--;
		items[count] = null;
		return true;
	}
	
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
	
	void removeAll()
	{
		count = 0;
		items = new Object[size];
	}
	
	void showAll()
	{
		for(int i = 0; i < count; i++)
		{
			System.out.print(items[i]+" ");
		}
		System.out.println();
	}
	
	boolean contains(Object a)
	{
		for(int i = 0; i < count; i++)
		{
			if(items[i].equals(a))
				return true;
		}
		return false;
	}
	
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
		System.out.println("Is bag empty "+bag.empty());
		System.out.println("Is bag full "+bag.full());
		bag.count();
		System.out.println("Add "+bag.add(0));
		for(int i = 1; i < 10; i++)
		{
			bag.add(i);
		}			
		
		bag.showAll();
		bag.count();
		System.out.println("Is bag empty "+bag.empty());
		System.out.println("Is bag full "+bag.full());
		bag.remove();
		bag.showAll();
		bag.count();
		bag.remove(1);
		bag.showAll();
		bag.count();
		
	}
}