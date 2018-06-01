class Stack extends Array 
{
	int size=elem.length;
	int top=-1;
	void insert(int val)
	{
		if(top==size-1)
		{
			System.out.println("overflow");
		}
		else 
		{
			top=top+1;
			elem[top]=val;
			System.out.println("The value pushed is "+ elem[top]);
		}
	}
	void delete()
	{
		if(top==-1)
		{
			System.out.println("under flow ");
		}
		else 
		{
			System.out.println("The  value popped is "+ elem[top]);
		}
	}
	void display()
	{
		if(top==-1)
		{
			System.out.println("under flow ");
		}
		else 
		{
			while(top!=-1)
			{
				System.out.println(elem[top]);
				top=top-1;
			}
		}
	}
}