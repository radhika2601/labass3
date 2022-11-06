package labass3;

public class Shape {
	void Area()
	{
		System.out.print("Shape:");
	}
}
	class Circle extends Shape   
	{
	 void areaOfCircle()
	 {
		 double pi1=3.14;
		 int r1=8;
		 double a=pi1*r1*r1;  
		 System.out.print("Area of circle is:"+a);
	 }
	}
	class Square extends Shape   
	{
	  void areaOfSquare()
	  {
		  int a1=5;
		  int b=a1*a1;   
		  System.out.print("Area of Square is: "+b);
	  }
	  public static void main(String[] args)
	  {
		  Circle c=new Circle();
		  c.areaOfCircle();
		  Square s=new Square();
		  s.areaOfSquare();
	  }
	}
