public abstract class Entity {

    private final char symbol;

    protected Entity(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }
}