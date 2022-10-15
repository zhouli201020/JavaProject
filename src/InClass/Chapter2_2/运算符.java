package InClass.Chapter2_2;

public class 运算符 {
    public static void main(String[] args) {
        System.out.println(2/4);
        System.out.println(2.0/4);
        System.out.println(13%5);
        System.out.println(23.6%12);
        System.out.println(23.6%12.2);
        System.out.println(~025);
        System.out.println(3&5);
        System.out.println(071^052);
        System.out.println((1==2)&(2==2));
        int i,j,k;
        i=(j=10)*(k=2);
        System.out.println(i);
        int x=2,y=5,max;
        max=x>y?x:y;
        System.out.println(max);
    }
}
