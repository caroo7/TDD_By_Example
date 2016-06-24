public abstract class Money {

    protected int amount;

    public abstract Money times(int multiplier);

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount
                && getClass().equals(o.getClass());
    }

    static Money dollar(int amount) {
        return new Dollar(amount);
    }

    static Money franc(int amount) {
        return new Franc(amount);
    }

}