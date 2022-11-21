package IntroductionToJavaProgramming;

import java.util.Date;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        Random rand1 = new Random(3);
        System.out.println("From rand1:");
        for(int i=0;i<10;i++){
            System.out.print(rand1.nextInt(1000)+" ");
        }
        Random rand2 = new Random(3);
        System.out.println("\nFrom rand2:");
        for(int i=0;i<10;i++){
            System.out.print(rand2.nextInt(1000)+" ");
        }
    }
}