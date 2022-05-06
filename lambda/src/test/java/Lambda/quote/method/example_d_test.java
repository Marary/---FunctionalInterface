package Lambda.quote.method;

import org.junit.Test;

import java.util.function.Consumer;

public class example_d_test {
    @Test
    public void test(){
        example demo = new example();
        Consumer<String> print = demo::print;
        print.accept("55hello66");
        print.accept("66hi");
    }
}
