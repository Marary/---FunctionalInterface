package Lambda.grammar;

import org.junit.Test;

public class test {

    @Test
    public void test_1(){
        grammar_λ demo=new grammar_λ();
//        输出99
        demo.fun_1(88,99);
//        输出99
        demo.fun_2(88,99);
//        会输出大于10的数或者不输出
        demo.fun_3(80);
//        输出80
        demo.fun_4(80);
//        输出59
        demo.fun_5(88,99);

    }
}
