package CardsWithPower;

public enum SuitPower {

    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int powers;

    SuitPower(int powers) {
        this.powers = powers;
    }

    public int getPowers() {
        return powers;
    }
}
