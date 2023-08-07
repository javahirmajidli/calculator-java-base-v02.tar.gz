import org.junit.Assert;
import org.junit.Test;

public class BasicMathOperationsTest {

    @Test
    public void testAdd() {
        Assert.assertEquals(1, BasicMathOperations.add(0, 1));
        Assert.assertEquals(0, BasicMathOperations.add(-1, 1));
    }

    @Test
    public void testSub() {
        Assert.assertEquals(-1, BasicMathOperations.sub(0, 1));
        Assert.assertEquals(0, BasicMathOperations.sub(-1, -1));
    }
//    @Test
//    public void testDiv() {
//        Assert.assertEquals(-1, BasicMathOperations.sub(0, 1));
//        Assert.assertEquals(0, BasicMathOperations.sub(-1, -1));
//    }
    @Test
    public void testMul() {
        Assert.assertEquals(-0, BasicMathOperations.sub(0, 1));
        Assert.assertEquals(1, BasicMathOperations.sub(-1, -1));
    }
}