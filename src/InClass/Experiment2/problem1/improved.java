/**
 * 问题一的提高要求，文件名：improved.java
 */
package InClass.Experiment2.problem1;

public class improved {
    public static void main(String[] args) {
        int[] array = {16, 21, 10, 62, 34};
        System.out.println("操作前的数组为：");
        basic.outputArray(array);
        evenArray(array);//调用方法将数组元素变为偶数
        System.out.println("操作后的数组为：");
        basic.outputArray(array);
    }

    /**
     * 将数组元素变为偶数
     *
     * @param array 所操作的数组
     */
    static void evenArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] *= 2;
            }
        }
    }

}
