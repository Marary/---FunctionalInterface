package FunctionInterface.param;

import org.junit.Test;

public class runnable_test {
    @Test
    public void test(){
//        匿名内部类的方式
        MyRunnable.startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"线程启动");
            }
        });
//        Lambda表达式的方式
        MyRunnable.startThread(()-> System.out.println(Thread.currentThread().getName()+"线程启动"));
    }
}
