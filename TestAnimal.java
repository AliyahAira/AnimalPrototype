public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        Animal dolly = registry.createSheep("Imee");
        Animal bessie = registry.createCow();
        Animal spirit = registry.createHorse();

        dolly.makeSound();
        bessie.makeSound();
        spirit.makeSound();

        System.out.println(dolly);
        System.out.println(bessie);
        System.out.println(spirit);
    }
}
