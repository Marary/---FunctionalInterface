package Lambda.quote.method;

import java.lang.String;
import org.junit.Test;
import java.util.function.Predicate;

public class staticMethod_test {
    @Test
    public void test(){
        Predicate<String> demo = staticMethod::startWithH;
        System.out.println(demo.test("hello"));
        System.out.println(demo.test("world"));
        System.out.println(demo.test("HAHA"));
    }
}
