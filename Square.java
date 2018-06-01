
class Square extends Shape
{
	public static void main(String args[ ])
	{
		Square sq=new Square();
		System.out.println("Area of Square with side 10 is "+sq.area(10,10));
		System.out.println("Perimeter of Square with side 10 is "+sq.perimeter(10,10));
	}
}