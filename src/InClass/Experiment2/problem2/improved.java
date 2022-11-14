/**
 * 问题二的提高要求
 */
package InClass.Experiment2.problem2;

import java.util.Scanner;

public class improved {
    public static void main(String[] args) {
        System.out.println("请输入行数：");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            space(n, i);
            star(i);
            System.out.println();
        }
    }

    /**
     * 输出空格
     *
     * @param n     总行数
     * @param index 当前行数（从0开始）
     */
    static void space(int n, int index) {
        for (int i = 0; i < n - 1 - index; i++) {
            System.out.print(" ");
        }
    }

    /**
     * 输出*
     *
     * @param index 当前行数（从0开始）
     */
    static void star(int index) {
        for (int i = 0; i < 6 + index * 2; i++) {
            System.out.print("*");
        }
    }

}
