package InClass.Chapter2_2;

/**
 * 说明：此程序利用While语句实现从1至100的加法
 */
public class DemoWhile {
    public static void main(String[] args) {
        int i = 1, sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("1-100的和为：" + sum);
    }
}
