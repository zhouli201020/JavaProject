package InClass.Chapter2_2; /**
 * 说明：此程序展示switch语句的使用
 */

import java.util.Scanner;

public class ex2_7 {
    public static void main(String[] args) {
        String dj;
        System.out.println("请输入一个0-100之间的分数：");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int d = a / 10;
        switch (d) {
            case 10:
            case 9:
                dj = "优秀";
                break;
            case 8:
                dj = "良好";
                break;
            case 7:
                dj = "中等";
                break;
            case 6:
                dj = "及格";
                break;
            default:
                dj = "不及格";
        }
        System.out.println("成绩" + a + "的对应等级为：" + dj);
    }
}
