/**
 * 问题二的基本要求，文件名：basic.java
 */
package InClass.Experiment2.problem2;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        System.out.println("请输入行数：");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            space(n, i);
            eightstar();
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
        for (int i = n - 1 - index; i > 0; i--) {
            System.out.print(" ");
        }
    }

    /**
     * 打印8个*
     */
    static void eightstar() {
        for (int i = 0; i < 8; i++) {
            System.out.print("*");
        }
    }

}
