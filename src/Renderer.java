import java.util.Optional;

public class Renderer {

    public void render(SimulationMap map) {
        for (int y = 0; y < map.getHeight(); y++) {
            for (int x = 0; x < map.getWidth(); x++) {
                char cellSymbol = getCellSymbol(map, new Position(x, y));
                printSymbol(cellSymbol);
            }
            System.out.println();
        }
    }

    private char getCellSymbol(SimulationMap map, Position position) {
        Optional<Entity> entityOptional = map.getEntity(position);
        if (entityOptional.isPresent()) {
            return entityOptional.get().getSymbol();
        }
        return '.';
    }

    private void printSymbol(char symbol) {
        System.out.print(symbol);
    }
}
