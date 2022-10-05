package Experiment1;

import java.util.Scanner;

/**
 * 功能：对输入的任何长度的整型数进行逆序并加1后输出
 * 方法：利用字符串存放逆序后的各位数字，之后调用Integer类中的parseInt方法，将字符串型转化为整型
 */
public class problem1_2_2 {
    public static void main(String[] args) {
        //提示用户输入一个四位数，并将结果保存在number中
        System.out.println("请输入一个整数：");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        //定义字符串型变量output用于存放逆序后的每一位数字
        String output = "";
        int temp;
        while (number != 0) {
            temp = number % 10;
            output += temp;
            number /= 10;
        }
        //调用Integer类中的parseInt方法，将字符串型转化为整型
        int a = Integer.parseInt(output);
        //将逆序后的结果加1
        a += 1;
        System.out.println("逆序加1后的结果为：" + a);
    }
}
