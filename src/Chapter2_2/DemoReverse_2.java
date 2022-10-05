package Chapter2_2; /**
 * 说明：此程序实现对输入的一个整数逆序输出，同时提供UI界面
 * 例如：输入12345，输出54321
 */

import javax.swing.*;

public class DemoReverse_2 {
    public static void main(String[] args) {
        int n, rightDigit;
        String str = JOptionPane.showInputDialog("Input an integer:");
        String output = "";
        n = Integer.parseInt(str);
        do {
            rightDigit = n % 10;
            output = output + rightDigit;
            n = n / 10;
        } while (n != 0);
        JOptionPane.showMessageDialog(null, "The reverse digits is :" + output, "结果", JOptionPane.PLAIN_MESSAGE);
    }
}
