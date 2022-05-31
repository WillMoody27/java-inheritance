public class Fish extends Animal{
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        // initialize values
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    //methods for Fish
    private void rest(){

    }
    private void moveMuscles(){

    }
    private void moveBackFin(){

    }
    private void swim(int speed){

        // move swimming events of fish
        moveMuscles();
        moveBackFin();

        // super methods called from animal class to use for Fish Class
        super.move(speed);
    }
}
