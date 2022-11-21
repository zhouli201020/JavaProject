package IntroductionToJavaProgramming.Chapter9;

public class Student {
    String name;
    int age;
    boolean isScienceMajor;
    char gender;
}
class Test{
    public static void main(String[] args) {
        Student std = new Student();
        System.out.println("name?"+std.name);
        System.out.println("age?"+std.age);
        System.out.println("isScienceMajor?"+std.isScienceMajor);
        System.out.println("gender?"+std.gender);
    }
}
