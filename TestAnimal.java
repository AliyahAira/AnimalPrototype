public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        Animal imee = registry.createSheep("Imee");
        Animal john = registry.createCow();
        Animal barbie = registry.createHorse();

        imee.makeSound();
        john.makeSound();
        barbie.makeSound();

        System.out.println(imee);
        System.out.println(john);
        System.out.println(barbie);
    }
}
