package FunctionInterface.result;

import org.junit.Test;

public class result_test {
    @Test
    public void test(){
//        测试匿名内部类的方式
        Result demo_1=new Result();
        demo_1.getResult_1();

//        测试Lambda表达式的方式
        Result demo_2=new Result();
        demo_2.getResult_2();
    }
}
