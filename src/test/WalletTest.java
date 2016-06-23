import org.testng.Assert;
import org.testng.annotations.Test;

public class WalletTest {

    @Test()
    public void multiplicationTest() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        Assert.assertEquals(10, product.amount);
        product = five.times(3);
        Assert.assertEquals(15, product.amount);
    }

}