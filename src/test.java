/**
 * 注：测试专用程序
 */

import javax.swing.*;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int i;
        long product=1;
        for (i=1;i<=18;i++){
            product*=i;
        }
        System.out.println(product);
    }
}