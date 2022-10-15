package InClass.Experiment1;

import java.util.Scanner;

/**
 * 功能：对输入的一个四位数进行加密后输出
 * 加密方法：将该数每一位上的数字加9，然后除以10取余作为该位上的新数字，最后将第1位
 * 和第3位上的数字互换，第2位和第4位上的数字互换，组成加密后的新数。
 */
public class problem1_1 {
    public static void main(String[] args) {
        //提示用户输入一个四位数，并将结果保存在number中
        System.out.println("请输入一个4位数：");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        //分别取出千位、百位、十位和个位
        int a = number / 1000;
        int b = number / 100 % 10;
        int c = number / 10 % 10;
        int d = number % 10;
        //将每一位上的数字加9，等价于每一位上的数字减1
        a -= 1;
        b -= 1;
        c -= 1;
        d -= 1;
        //由于每一位上的数字不会超过9，因此对10取余的结果不变
        int temp;
        //交换第一位和第三位
        temp = c;
        c = a;
        a = temp;
        //交换第二位和第四位
        temp = d;
        d = b;
        b = temp;
        //最终加密后的结果
        int encoded = a * 1000 + b * 100 + c * 10 + d;
        System.out.println("加密后的新数为：" + encoded);
    }
}
