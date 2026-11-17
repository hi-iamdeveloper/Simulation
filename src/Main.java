public class Main {
    public static void main(String[] args) {
        SimulationMap map = new SimulationMap(10, 5);

        Herbivore rabbit = new Herbivore();
        Predator wolf = new Predator();
        Grass grass = new Grass();

        map.placeEntity(rabbit, new Position(1, 1));
        map.placeEntity(wolf, new Position(8, 3));
        map.placeEntity(grass, new Position(4, 2));

        new Renderer().render(map);

        boolean rabbitPlaced = map.getEntity(new Position(1, 1)).orElse(null) == rabbit;
        boolean wolfPlaced = map.getEntity(new Position(8, 3)).orElse(null) == wolf;
        boolean grassPlaced = map.getEntity(new Position(4, 2)).orElse(null) == grass;

        System.out.println("Заяц в (1,1): " + rabbitPlaced);
        System.out.println("Волк в (8,3): " + wolfPlaced);
        System.out.println("Трава в (4,2): " + grassPlaced);

        if (rabbitPlaced && wolfPlaced && grassPlaced) {
            System.out.println("OK: все существа на карте");
        } else {
            System.out.println("FAIL: кто-то не на месте");
        }
    }
}