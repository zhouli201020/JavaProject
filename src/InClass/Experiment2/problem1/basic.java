/**
 * 问题一的基本要求
 */
package InClass.Experiment2.problem1;


public class basic {
    /**
     * 主方法
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] array = {16, 21, 10, 62, 34};
        outputArray(array);
        System.out.println("数组所有元素之和为：" + sumArray(array));
        System.out.println("数组中的最大元素为：" + maxArray(array));
    }

    /**
     * 输出数组中的所有元素
     *
     * @param array 所操作的数组
     */
    static void outputArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }


    /**
     * 输出数组所有元素之和
     *
     * @param array 所操作的数组
     * @return 数组所有元素之和
     */
    static int sumArray(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }

    /**
     * 输出数组中的最大值
     *
     * @param array 所操作的数组
     * @return 数组中的最大值
     */
    static int maxArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

}
