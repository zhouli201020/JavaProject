/**
 * 问题一的思考，文件名：think.java
 */
package InClass.Experiment2.problem1;

public class think {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(n);
        evenint(n);
        System.out.println(n);
    }

    static void evenint(int num) {
        if (num % 2 != 0) {
            num *= 2;
        }
    }
}
/**
 * 说明：
 * 1.对于基本数据类型参数，在调用方法时传递的是实参的值，方法中的操作并不会改变实参的值
 * 2.而对于数组类型参数，参数值是数组的引用，给方法传递的是这个引用。从语义上来讲，
 * 最好的描述就是参教传递的是共享信息（pass-by-sharing)，即方法中的数组和传递的数
 * 组是一样的。所以，如果改变方法中的数组，将会看到方法外的数组也变化了。
 */