public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal("Generic","small",400);
//        doAnimalStuff(animal,"fast");
        Dog dog = new Dog();
        doAnimalStuff(dog,"fast");

        Dog dog1 = new Dog("Yorkie","medium",10,"swimmer","Curled");
        doAnimalStuff(dog1,"fast");

        Dog dog2 = new Dog("Retriever",19);
        doAnimalStuff(dog2,"slow");
    }

    public static void doAnimalStuff(Animal animal ,String speed) {
        animal.makeSomeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}