public abstract class Creature extends Entity {

    protected Creature(char symbol) {
        super(symbol);
    }

    public abstract void makeMove(SimulationMap map);
}