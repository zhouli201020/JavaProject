package InClass.Chapter3;

public class TestCircle {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println(c1);
		//上面一行等价于
		//System.out.println(c1.toString());
		//因为当输出一个对象的引用时，会自动调用该对象的toString()方法
		//同时，由于我们在Circle类中重写了该类的toString()方法，所以最终输出我们想要的格式
		System.out.println("Radius:"+c1.getRadius());
		System.out.println("圆的总数："+Circle.getNum());
		
		Circle c2 = new Circle(1,1,2);		
		System.out.println(c2);
		System.out.println("x:"+c2.getX());
		System.out.println("圆的总数："+Circle.getNum());
		
		Circle c3 = new Circle(2,3);
		System.out.println(c3);
		System.out.println("y:"+c3.getY());
		System.out.println("圆的总数："+Circle.getNum());
	}

}
