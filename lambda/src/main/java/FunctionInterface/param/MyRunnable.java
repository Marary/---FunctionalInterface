package FunctionInterface.param;

public class MyRunnable{
    /**
     *
     * 将JAVA已经为我们写好的Runnable接口作为参数传递,在多线程操作的应用里非常普遍.
     * 在此,只是为大家简单地演示一下
     * @param runnable
     */
    public static void startThread(Runnable runnable){
        new Thread(runnable).run();
    }
}
