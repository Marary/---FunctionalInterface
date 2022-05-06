package FunctionInterface.param;

import org.junit.Test;

public class action_test {
    @Test
    public void test(){
        action demo=new action();
        demo.Click(()-> System.out.println());
    }
}
