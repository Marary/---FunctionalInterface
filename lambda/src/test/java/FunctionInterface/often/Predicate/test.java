package FunctionInterface.often.Predicate;

import org.junit.Test;

public class test {
    @Test
    public void test(){
        Checks.Compare("我喜欢你","我不喜欢你");

        Checks.CheckLength("Hello Java");
        Checks.CheckLength("Hello");
        Checks.CheckLength("Java");

        String[] strings={"蛮王,30","林黛玉,22","盲僧,35","拉格朗日,36","费马,45"};
        Checks.getData(strings);
    }
}
