import org.testng.Assert;
import org.testng.annotations.Test;

public class WalletTest {

    @Test()
    public void multiplicationTest() {
        Dollar five = new Dollar(5);
        five.times(2);
        Assert.assertEquals(10, five.amount);
    }

}