import java.util.*;

public class SimulationMap {

    private final int width;
    private final int height;
    private final Map<Position, Entity> entities;

    public SimulationMap(int width, int height) {
        this.width = width;
        this.height = height;
        this.entities = new HashMap<>();
    }

    public void moveEntity(Entity entity, Position newEntityPosition) {
        Optional<Position> currentPosition = getPosition(entity);
        if (currentPosition.isEmpty()) {
            return;
        }
        Position current = currentPosition.get();
        entities.remove(current);
        entities.put(newEntityPosition, entity);
    }

    public Optional<Entity> getEntity(Position position) {
        return Optional.ofNullable(entities.get(position));
    }

    public void placeEntity(Entity entity, Position position) {
        entities.put(position, entity);
    }

    public void removeEntity(Position position) {
        entities.remove(position);
    }

    public boolean isCellEmpty(Position position) {
        return !entities.containsKey(position);
    }

    public boolean isInBounds(Position position) {
        return position.x() >= 0 && position.x() < width
                && position.y() >= 0 && position.y() < height;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Optional<Position> getPosition(Entity entity) {
        for (Position pos : entities.keySet()) {
            if (entities.get(pos) == entity) {
                return Optional.of(pos);
            }
        }
        return Optional.empty();
    }
}
