package FunctionInterface.often.Function;

import org.junit.Test;

public class test {
    @Test
    public void test(){
//        对于字符串我们写了匹配,所以可以随意写
        System.out.println("测试用例1");
        fun.getFun("sad100",100);
        System.out.println("测试用例2");
        fun.getFun("Hello Java",100);
    }
}
