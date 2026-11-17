public class Main {

    // ВЕРНУТЬ ЭНТИТИ АБСТРАКТ И УБРАТЬ СИМВОЛЬНЫЙ КОСТЫЛЬ!

    static void main(String[] args) {
        SimulationMap map = new SimulationMap(20, 6);
        map.placeEntity(new Entity('W'), new Position(1, 0));
        map.placeEntity(new Entity('R'), new Position(3, 2));
        new Renderer().render(map);
    }
}
