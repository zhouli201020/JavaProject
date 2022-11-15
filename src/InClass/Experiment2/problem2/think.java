/**
 * 问题二的思考题，文件名为：think.java
 */
package InClass.Experiment2.problem2;

import java.util.Scanner;

public class think {
    public static void main(String[] args) {
        System.out.println("请输入心形上半部分的行数（为了保证能够显示出图形，行数至少为2）：");
        Scanner s = new Scanner(System.in);
        int up = s.nextInt();
        for (int i = 0; i < up; i++) {
            for (int j = 0; j < 2 * up - 1 - 2 * i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 + 4 * i; k++) {
                System.out.print("*");
            }
            for (int m = 0; m < 4 * up - 4 * i - 4; m++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 + 4 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 8 * up - 2; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < 2 * up; i++) {
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 8 * up - 2 - 4 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
