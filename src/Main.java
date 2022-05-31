public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1,1,5,5);

        Dog dog = new Dog(
                "Shepard",
                8,
                20,
                2,
                4,
                1,
                20,
                "long silky"
        );
        // working w/methods from Animal class for inherited features
        // since inherit from animal class then we can pass methods and features
        dog.eat();
        dog.run();
//        dog.walk();
    }
}