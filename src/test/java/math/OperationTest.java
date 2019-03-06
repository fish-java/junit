package math;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OperationTest {
    @Before
    public void doBefore(){
        System.out.println("do something before each test");
    }

    @After
    public void doAfter(){
        System.out.println("do something after each test");
    }

    @Test
    public void add() {
        int res = Operation.add(1, 3);
        Assert.assertEquals(4,res);
    }

    // 期望500毫秒内得到返回值 will fail
    @Test(timeout = 500)
    public void multiple() {
        Assert.assertEquals(4,Operation.multiple(2,2));
    }

    // no limit time, this test will pass.
    @Test()
    public void multiple1() {
        Assert.assertEquals(4,Operation.multiple(2,2));
    }

    // 期望产生一个异常, this test will pass.
    @Test(expected = ArithmeticException.class)
    public void divide() {
        Operation.divide(10,0);
    }
}