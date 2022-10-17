package InClass.Chapter2_3;
/**
 * 说明：此程序打印九九乘法表
 */
public class MultiplyTable {
    public static void main(String[] args) {
        for (int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.printf("%d*%d=%d",j,i,j*i);
                System.out.printf("\t");
            }
            System.out.println();
        }
    }
}
