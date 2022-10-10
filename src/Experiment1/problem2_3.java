package Experiment1;

import java.util.Scanner;

/**
 * 功能：利用循环语句打印图示图案
 */
public class problem2_3 {
    public static void main(String[] args) {
        System.out.println("请输入要打印的行数：");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * n - (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
