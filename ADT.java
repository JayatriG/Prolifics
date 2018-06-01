class ADT
{
	public static void main(String args[])
	{
		Stack s1=new Stack();
		s1.insert(35);
		s1.insert(42);
		s1.insert(53);
		s1.insert(64);
		s1.display();
		s1.delete();
		s1.display();
		Queue q1=new Queue();
		q1.insert(35);
		q1.insert(42);
		q1.insert(53);
		q1.insert(64);
		q1.display();
		q1.delete();
		q1.display();
	}
}