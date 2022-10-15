package InClass.Chapter2_2; /**
 * 说明：此程序实现对输入的一个整数逆序输出
 * 例如：输入12345，输出54321
 */

import java.util.Scanner;

public class DemoReverse {
    public static void main(String[] args) {
        int num;
        System.out.println("请输入任意一个整数：");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        while (num != 0) {
            System.out.print(num % 10);
            num /= 10;
        }
    }
}
