package InClass.Chapter2_2;

/**
 * 说明：此程序利用Do-While语句实现从1至100的加法
 */
public class DemoDoWhile {
    public static void main(String[] args) {
        int i = 1, sum = 0;
        do {
            sum += i;
            i++;
        } while (i <= 100);
        System.out.println("sum=" + sum);
    }
}
