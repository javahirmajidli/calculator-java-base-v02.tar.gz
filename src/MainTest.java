import org.junit.Assert;
import org.junit.Test;


public class MainTest {
    @Test
    public void testParseLineAdd() {
        Assert.assertEquals(Fields.Operation.ADD, Main.parseLine("ADD 0 1").getOp());
    }
    @Test
    public void testParseLineSub() {
        Assert.assertEquals(Fields.Operation.SUB, Main.parseLine("SUB 5 3").getOp());
    }
    @Test
    public void testParseLineDiv() {
        Assert.assertEquals(Fields.Operation.DIV, Main.parseLine("DIV 10 2").getOp());
    }
    @Test
    public void testParseLineMul() {
        Assert.assertEquals(Fields.Operation.MUL, Main.parseLine("MUL 20 1").getOp());
    }
    @Test
    public void testParseLineSum() {
        Fields fields = Main.parseLine("SUM 1 2 3 4"){
            int[] expectedNumbers = {1, 2, 3, 4};
        }
        Assert.assertArrayEquals(expectedNumbers, fields.getNumbers());
    }
}