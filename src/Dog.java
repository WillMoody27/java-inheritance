public class Dog extends Animal {
    //inherit using extends keyword - need to call construct class from another

    // create fields specific to Dog class
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // from animal class
    // additional characteristics -> base class
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        // super call construct from class extending from
        super(name, 1, 1, size, weight);
        // initialize other fields relating directly to Dog class and Animal Class
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    private void chew(){
        System.out.println("Dog.chew() Called");
    }

    // override method in other class
    @Override
    public void eat() {
        System.out.println("Dog.chew() Called");
        chew();
        super.eat(); // called super equivalent of class
    }
    public void walk(){
        System.out.println("Dog.walk() Called");
        super.move(5);
    }
    public void run(){
        System.out.println("Dog.run() Called");
        move(10);
    }
    private void moveLegs(int speed){

    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.moveLegs() called");
        moveLegs(speed);
        super.move(speed);
    }
}
