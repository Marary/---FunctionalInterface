package Lambda.quote.constructor;

/**
 * To facilitate the demonstration of constructor references, we first created a student class in which there
 * are four constructors, covering all cases of two parameters.
 * To make it easier to observe whether an object is assigned a value, we can override the toString () method.
 * 为了方便演示构造器引用，我们先创建了一个学生类，在此类中有四种构造器，涵盖了两个参数的所有种情况。
 * 为了方便观察是否为对象赋值，我们可以重写一下toString()方法。
 */
public class Student {
    private int age;
    private String name;

    private Student(){}


    public Student(int age) {
        this.age = age;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
