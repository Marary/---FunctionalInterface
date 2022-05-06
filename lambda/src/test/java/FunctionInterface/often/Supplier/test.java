package FunctionInterface.often.Supplier;

import org.junit.Test;

public class test {

    @Test
    public void test(){
//        输出数组中最大的数,此例中为99.8
        Double[] doubles={23.0,5.5,6.5,99.8,7.6,4.4,66.6,52.0,52.1,77.4};
        Max.getMax(doubles);
    }
}
