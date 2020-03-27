import java.util.Vector;

public class Stack<T>
{
	private Vector<T> stack;
	private int size = 0;
	Stack()
	{
		stack = new Vector<T>(10);
	}
	Stack(int space)
	{
		stack = new Vector<T>(space);
	}
	public void push(T item)
	{
		stack.add(item);
		size++;
	}
	public T pop()
	{
		if(size == 0)
			return null;
		size--;
		T item = stack.get(size);
		stack.remove(size);
		return item;
		
	}
	public T peek()
	{
		if(size == 0)
			return null;
		return stack.get(size - 1);
	}
	public int size()
	{
		return size;
	}
	
	public void clear()
	{
		int size = 0;
		stack.clear();
	}
	public static void main(String args[])
	{
	}
}