import java.awt.*;
import java.awt.datatransfer.StringSelection;

public class Franc extends Money {

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    public Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }

    String currency() {
        return currency;
    }
}
