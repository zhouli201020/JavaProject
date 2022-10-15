package InClass.Chapter2_2; /**
 * 说明：此程序判断输入的年份为平年还是闰年
 */

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        int year;
        boolean IsLeapyear;
        String result;
        System.out.println("请输入年份：");
        Scanner s = new Scanner(System.in);
        year = s.nextInt();
        IsLeapyear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        if (IsLeapyear)
            result = year + " is a leap year.";
        else
            result = year + " is not a leap year.";
        System.out.println(result);
    }
}
