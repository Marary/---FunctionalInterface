package Lambda.quote.constructor;

import org.junit.Test;

import java.util.function.BiFunction;
import java.util.function.Function;

public class test {

    @Test
    public void test(){
        BiFunction<Integer, String, Student> demo_1 = Student::new;
        System.out.println(demo_1.apply(19,"张三").toString());

        Function<Integer, Student> demo_2 = Student::new;
        System.out.println(demo_2.apply(20).toString());

        Function<String, Student> demo_3 = Student::new;
        System.out.println(demo_3.apply("李四").toString());

    }
}
