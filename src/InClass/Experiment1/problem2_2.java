package InClass.Experiment1;

/**
 * 功能：计算1+1/3+1/5+1/7+1/9+1/11+…的前100项之和
 */
public class problem2_2 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 100; i++) {
            double temp;
            temp = 1.0 / (2 * i - 1);//注意：分子应该为1.0而不是1，否则分子和分母同为int型运算结果会出错
            sum += temp;
        }
        System.out.println("算式的前100项之和为：" + sum);
    }
}
