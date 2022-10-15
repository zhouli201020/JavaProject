package InClass.Experiment1;

import java.util.Scanner;

/**
 * 功能：对输入的任何长度的整型数进行逆序并加1后输出
 */
public class problem1_2_1 {
    public static void main(String[] args) {
        //提示用户输入一个四位数，并将结果保存在number中
        System.out.println("请输入一个整数：");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        //定义整型变量output，用于保存逆序后的结果，其初始值设为1
        int output = 0;
        while (number != 0) {
            output = 10 * output + number % 10;
            number /= 10;
        }
        //将逆序后的结果加1
        output += 1;
        System.out.println("逆序加1后的结果为：" + output);
    }
}
