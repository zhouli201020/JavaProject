package Experiment1;

/**
 * 功能：计算1-1/3+1/5-1/7+1/9-1/11+…的前100项之和
 */
public class problem2_1 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 100; i++) {
            double temp;
            temp = Math.pow(-1, i + 1) / (2 * i - 1);//pow()方法的返回类型为double，保证了分子和分母有一个为double型，这样运算结果不会出错
            sum += temp;
        }
        System.out.println("算式的前100项之和为：" + sum);
    }
}
