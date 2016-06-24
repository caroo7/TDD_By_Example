import java.awt.*;

public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount;
    }

}
