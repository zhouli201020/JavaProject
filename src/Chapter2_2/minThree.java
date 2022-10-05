package Chapter2_2;

/**
 * 说明：此程序判断输入的三个数哪一个最小
 */
public class minThree {
    public static void main(String[] args) {
        int num1 = (int) (100 * Math.random());
        int num2 = (int) (100 * Math.random());
        int num3 = (int) (100 * Math.random());
        System.out.println("The first number is " + num1);
        System.out.println("The second number is " + num2);
        System.out.println("The third number is " + num3);
        if (num1 > num2) {
            if (num2 > num3) {
                System.out.println("The minimum number is " + num3);
            } else {
                System.out.println("The minimum number is " + num2);
            }
        } else {
            if (num1 > num3) {
                System.out.println("The minimum number is " + num3);
            } else {
                System.out.println("The minimum number is " + num1);
            }
        }
    }
}
