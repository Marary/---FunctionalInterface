package Lambda.quote.method;

import org.junit.Test;
import java.util.function.BiPredicate;


public class example_c_test {
    /**
     * Use the instance method through the class name.
     * Here, for simplicity, I directly use Java The equals' method under lang.String package.
     * We can see that the original writing method of lambda expression is different from that through method reference.
     * Method reference will automatically pass your parameters into the method you reference.
     * 通过类名去使用实例方法，在此，为了简单，我直接通过java.lang.String包下的equals方法进行演示。
     * 我们可以看到Lambda表达式最原始的写法与通过方法引用写法的不同，方法引用会自动把你的参数传入你引用的方法里。
      */
    @Test
    public void test(){
        BiPredicate<String,String> demo_l= (s1,s2)-> s1.equals(s2);
        BiPredicate<String,String> demo = String::equals;

        System.out.println(demo_l.test("hello","hello"));
        System.out.println(demo.test("hello","hi"));

    }
}
