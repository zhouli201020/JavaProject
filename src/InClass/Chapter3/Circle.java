package InClass.Chapter3;

public class Circle {
	private double x;//成员变量，4种访问修饰符 public private 缺省
	private double y;
	private double radius;
	private static int num;
	public static int getNum() {
		return num;
	}
		
	public Circle() {
		this(0,0,10);//this()：调用本类中的其它的构造方法
		//x = 0;
		//y = 0;
		//radius = 10;
	}
	public Circle(double x, double y1, double r) {
		this.x = x;
		this.y = y1;
		radius = r;
		num++;
	}
	public Circle(double x1, double y1) {
		x = x1;
		y = y1;
		radius = 5;
		num++;
	}

	public void setX(double x1) {
		x = x1;
	}
	public void setY(double y1) {
		y = y1;
	}
	public void setRadius(double r) {
		radius = r;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {//成员方法 4种访问修饰符 public private 缺省
		return Math.PI*radius*radius;
	}
	public double getPerimeter() {//成员方法
		return 2*Math.PI*radius;
	}

	public String toString() {
		return "Circle:center=["+x+","+y+"],radius="+radius;
	}
}

