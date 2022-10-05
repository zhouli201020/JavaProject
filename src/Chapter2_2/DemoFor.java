package Chapter2_2;

/**
 * 说明：此程序利用for语句实现从1至100的加法
 */
public class DemoFor {
    public static void main(String[] args) {
        int i, sum;
        sum = 0;
        for (i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1-100的和为：" + sum);
    }
}
