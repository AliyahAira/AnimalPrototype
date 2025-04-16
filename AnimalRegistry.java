public class AnimalRegistry {
    private Sheep sheepPrototype;
    private Cow cowPrototype;
    private Horse horsePrototype;

    public AnimalRegistry() {
        sheepPrototype = new Sheep(4, "Baa", "Grass", "Dolly");
        cowPrototype = new Cow(4, "Moo", "Hay");
        horsePrototype = new Horse(4, "Neigh", "Oats", "Black");
    }

    public Animal createSheep(String name) {
        Sheep cloned = (Sheep) sheepPrototype.clone();
        return new Sheep(cloned.clone().getType().equals("Sheep") ? 4 : 0, "Baa", "Grass", name);
    }

    public Animal createCow() {
        return cowPrototype.clone();
    }

    public Animal createHorse() {
        return horsePrototype.clone();
    }
}
