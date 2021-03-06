public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    //methods
    public void eat(){
        System.out.println("Animal.eat() Called");

    }
    public void move(int speed){
        System.out.println("Animal.move() Called. Animal is moving at " + speed                                                                                                                                                                                                                                                                                                                                                         );

    }

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }
    //getters - characteristics of animal
    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
