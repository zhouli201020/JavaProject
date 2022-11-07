/**
 * 通过调用方法，计算圆的面积
 */
package InClass.Chapter2_4;

public class getArea {
    static double Area(double r) {
        double s = Math.PI * r * r;
        return s;
    }

    public static void main(String[] args) {
        double radius = 3.5;
        double area = Area(radius);
        System.out.println("圆的面积为：" + area);
    }
}
